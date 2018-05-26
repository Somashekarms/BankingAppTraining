package PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Users extends Base {
	
	public static WebElement Users_Btn(WebDriver driver)
	{
		return driver.findElement(ele("Users_xpath"));
	}

}
