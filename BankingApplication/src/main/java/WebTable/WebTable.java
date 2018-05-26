package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import TestBase.Base;

public class WebTable {
	

	static boolean status=false;
	
	public static void webtable(WebDriver driver,By prop,String operation,String id)
	{
		try {
			boolean flag=false;
			WebElement table=driver.findElement(prop);
			
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			
			String[] pagelinks=rows.get(rows.size()-1).getText().split(" ");
			
			for(int l=1;l<pagelinks.length;l++)
			{
				
				table=driver.findElement(prop);
				
				rows=table.findElements(By.tagName("tr"));
				
				for(WebElement r:rows)
				{
					List<WebElement> columns=	r.findElements(By.tagName("td"));
					
					for(WebElement c:columns)
					{
						if(c.getText().matches(id))
						{
							
							if(operation.equalsIgnoreCase("edit"))
							{
								columns.get(columns.size()-2).findElement(By.tagName("a")).click();
							}
							else if(operation.equalsIgnoreCase("delete"))
							{
								columns.get(columns.size()-1).findElement(By.tagName("a")).click();
							}
							else
							{
								System.out.println("operation failed");
							}
							flag=true;
							break;
						}
					}
					if(flag==true)
					{
						break;
					}
				}
				if(flag==true)
				{
					break;
				}
				
				
				
				try {
					if(pagelinks[l].contains("...") && status==true)
					{
						driver.findElement(By.xpath("//a[contains(.,'...')][2]")).click();
					}
					else
					{
						table.findElement(By.linkText(pagelinks[l])).click();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(pagelinks[l].contains("..."))
				{
					status=true;
					webtable(driver, prop, operation, id);
				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
		
		
		
		
	
}
