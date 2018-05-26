package PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class NewRole extends Base {
	
	public static WebElement RoleName(WebDriver driver)
	{
		return driver.findElement(ele("RoleName_NR_id"));
	}
	public static WebElement RoleDescription(WebDriver driver)
	{
		return driver.findElement(ele("RoleDesc_NR_id"));
	}
	public static WebElement RoleType(WebDriver driver)
	{
		return driver.findElement(ele("RoleType_NR_id"));
	}
	public static WebElement Submit(WebDriver driver)
	{
		return driver.findElement(ele("Submit_NR_id"));
	}

}
