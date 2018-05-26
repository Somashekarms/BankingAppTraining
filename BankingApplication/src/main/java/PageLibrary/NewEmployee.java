package PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class NewEmployee extends Base {
	
	public static WebElement EmployerName(WebDriver driver)
	{
		return driver.findElement(ele("EmployerName_NE_id"));
	}
	public static WebElement LoginPwd(WebDriver driver)
	{
		return driver.findElement(ele("LoginPwd_NE_id"));
	}
	public static WebElement Role_NE(WebDriver driver)
	{
		return driver.findElement(ele("Role_NE_id"));
	}
	public static WebElement Branch_NE(WebDriver driver)
	{
		return driver.findElement(ele("Branch_NE_id"));
	}
	public static WebElement SubmitBtn_NE(WebDriver driver)
	{
		return driver.findElement(ele("Submit_NE_id"));
	}

}
