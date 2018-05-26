package PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Roles extends Base {
	
	public static WebElement NewRole(WebDriver driver)
	{
		return driver.findElement(ele("NewRole_Btn_id"));
	}

}
