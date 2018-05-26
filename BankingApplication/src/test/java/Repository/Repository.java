package Repository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Excel.Excell_class;
import PageLibrary.Admin_Master;
import PageLibrary.Branches;
import PageLibrary.Employee;
import PageLibrary.Generic;
import PageLibrary.HomePage;
import PageLibrary.NewBranch;
import PageLibrary.NewEmployee;
import PageLibrary.NewRole;
import PageLibrary.Roles;
import TestBase.Base;
import WebTable.WebTable;

public class Repository extends Base {
	WebDriver driver;
	
	public void login()
	{
		HomePage.username_editbox(driver).sendKeys(config("Username"));
		HomePage.password_editbox(driver).sendKeys(config("Password"));
		HomePage.login_btn(driver).click();
	}
	public void launch(String brow)
	{
		if(brow.equalsIgnoreCase("firefox"))
		{
			System.setProperty(config("FirefoxDriverName"),config("FirefoxDriverPath"));
			driver=new FirefoxDriver();
		}
		else if(brow.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(config("Build1URL"));
	}
	public void Branches_Btn()
	{
		Admin_Master.Branches_Btn(driver).click();
	}
	public void Branch_Search()
	{
		Branches.Country_Dropdown(driver).selectByVisibleText("INDIA");
		Branches.State_Dropdown(driver).selectByVisibleText("Karnataka");
		Branches.City_Dropdown(driver).selectByVisibleText("BANGLORE");
		Branches.Search_Btn(driver).click();
	}	
	public void NewBranch_Creation(String BranchName, String Address1, String Zip, String Country, String State, String City)
	{
		Branches.NewBranch_Btn(driver).click();
		NewBranch.BranchName_NB(driver).sendKeys(BranchName);
		NewBranch.Address1_NB(driver).sendKeys(Address1);
		NewBranch.Zip_NB(driver).sendKeys(Zip);
		NewBranch.Country_NB(driver).selectByVisibleText(Country);
		NewBranch.State_NB(driver).selectByVisibleText(State);
		NewBranch.City_NB(driver).selectByVisibleText(City);
		NewBranch.SubmitBtn_NB(driver).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//public void NewRole_Creation()
	public void Roles_Btn()
	{
		Admin_Master.Roles_Btn(driver).click();
	}
	
	public void NewRole_Creation(String RoleName, String RoleDescription, String RoleType)
	{
		Roles.NewRole(driver).click();
		NewRole.RoleName(driver).sendKeys(RoleName);
		NewRole.RoleDescription(driver).sendKeys(RoleDescription);
		NewRole.RoleType(driver).sendKeys(RoleType);
		NewRole.Submit(driver).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Employee_Btn()
	{
		Admin_Master.Employee_Btn(driver).click();
		
	}
	public void NewEmployee_Creation(String EmployerName, String LoginPwd, String Role, String Branch)
	{
		Employee.NewEmplyee(driver).click();
		NewEmployee.EmployerName(driver).sendKeys("EmployerName");
		NewEmployee.LoginPwd(driver).sendKeys("LoginPwd");
		NewEmployee.Role_NE(driver).sendKeys("Role");
		NewEmployee.Branch_NE(driver).sendKeys("Branch");
		NewEmployee.SubmitBtn_NE(driver).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Users_Btn()
	{
		Admin_Master.Users_Btn(driver).click();
	}
	public void Logout_Btn()
	{
		Generic.Logout_Emp(driver).click();
	}
	
	public void table()
	{
		Admin_Master.Branches_Btn(driver).click();
		WebTable.webtable(driver, By.id("DG_bankdetails"), "edit", "188");
	}

}







