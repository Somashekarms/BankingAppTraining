package PageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import TestBase.Base;

public class NewBranch extends Base {
	
	public static WebElement BranchName_NB(WebDriver driver)
	{
		return driver.findElement(ele("BranchName_NB_id"));
	} 
	public static WebElement Address1_NB(WebDriver driver)
	{
		return driver.findElement(ele("Address1_NB_id"));
	}
	public static WebElement Zip_NB(WebDriver driver)
	{
		return driver.findElement(ele("Zip_NB_id"));
	}
	public static Select Country_NB(WebDriver driver)
	{
		return new Select(driver.findElement(ele("Country_NB_id")));
	}
	public static Select State_NB(WebDriver driver)
	{
		return new Select(driver.findElement(ele("State_NB_id")));
	}
	public static Select City_NB(WebDriver driver)
	{
		return new Select(driver.findElement(ele("City_NB_id")));
	}
	public static WebElement SubmitBtn_NB(WebDriver driver)
	{
		return driver.findElement(ele("Submit_NB_id"));
		
	}
	

}


