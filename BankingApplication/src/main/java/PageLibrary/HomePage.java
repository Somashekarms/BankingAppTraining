package PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class HomePage extends Base {
	
	public static WebElement username_editbox(WebDriver driver)
	{
		return driver.findElement(ele("Username_id"));
	}
	
	public static WebElement password_editbox(WebDriver driver)
	{
		return driver.findElement(ele("Password_id"));
	}
	public static WebElement login_btn(WebDriver driver)
	{
		return driver.findElement(ele("LoginBtn_id"));
	}

	
}
