package PageLibrary;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Generic extends Base {
	
	public static Alert Al(WebDriver driver)
	{
		Alert al=driver.switchTo().alert();
		return al;
	}
	public static WebElement Logout_Emp(WebDriver driver)
	{
		return driver.findElement(ele("Logout_Btn_Emp"));
	}

}
