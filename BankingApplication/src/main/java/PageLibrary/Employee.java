package PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Employee extends Base {
	
	public static WebElement NewEmplyee(WebDriver driver)
	{
		return driver.findElement(ele("NewEmployee_Btn_id"));
	}	

}
