package PageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import TestBase.Base;

public class Admin_Master extends Base {
	
	public static WebElement Branches_Btn(WebDriver driver)
	{
		return driver.findElement(ele("Branches_xpath"));
		
	}
	public static WebElement Roles_Btn(WebDriver driver)
	{
		return driver.findElement(ele("Roles_xpath"));	
		
	}
	public static WebElement Employee_Btn(WebDriver driver)
	{
		return driver.findElement(ele("Employee_xpath"));	
		
	}
	public static WebElement Users_Btn(WebDriver driver)
	{
		return driver.findElement(ele("Users_xpath"));
	}
	

}
