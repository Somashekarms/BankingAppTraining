package PageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import TestBase.Base;

public class Branches extends Base {
	
	public static Select Country_Dropdown(WebDriver driver)
	{
		return new Select(driver.findElement(ele("CountryDD_id")));			
	}
	public static Select State_Dropdown(WebDriver driver)
	{
		return new Select(driver.findElement(ele("State_id")));
	}
	public static Select City_Dropdown(WebDriver driver)
	{
		return new Select(driver.findElement(ele("City_id")));
	}
	public static WebElement Search_Btn(WebDriver driver)
	{
		return driver.findElement(ele("SearchBtn_id"));
	}
	public static WebElement NewBranch_Btn(WebDriver driver)
	{
		return driver.findElement(ele("NewBranchBtn_id"));
	}

}




















































































































































































































































