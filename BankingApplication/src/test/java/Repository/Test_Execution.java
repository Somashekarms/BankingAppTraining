package Repository;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Excel.Excell_class;
import PageLibrary.Generic;

public class Test_Execution extends Repository {
	
	
	@Parameters({"browser"})
	@BeforeTest
	public void verify_launch(String brow)
	{
		launch(brow);
	}
    @Test(priority=0)
	public void verify_login()
	{
	login();	
	
	}
    @Test(priority=1)
    public void verify_table()
    {
    	table();
    }
    
    /*@Test(priority=1)
    public void verify_BranchDetails()
    {
    	Branches_Btn();
    }
    
    
    @Test(priority=2)
    public void verify_CountryDropdown()
    {
    	Branch_Search();
    }*/
   /* @Test(priority=3)
    public void verify_NewBranch()
    {
    	New_Branch();
    }*/
    /*@Test(priority=4, dataProvider="branch")
    public void verify_NewBranch_Creation(String BranchName, String Address1, String Zip, String Country, String State, String City )
    {
    	NewBranch_Creation(BranchName, Address1, Zip, Country, State, City);
    }*/
    /*@DataProvider(name="branch")
    public Object[][] verify_excel()
    {
    	return excelcontent("data.xls", "NewBranch");
    }*/

   /* @Test(priority=3)
    public  void verify_branch_WithoutDP()
    {
    	Excell_class.excelconnection("data.xls", "NewBranch");
    	
    	Excell_class.outputexcelconnection("data.xls", "output.xls", "NewBranch");
    	
    	for(int i=1;i<Excell_class.rcount();i++)
    	{
    		NewBranch_Creation(Excell_class.readdata(0, i) , Excell_class.readdata(1, i), Excell_class.readdata(2, i), Excell_class.readdata(3, i), Excell_class.readdata(4, i),Excell_class.readdata(5, i));
    		
    	String text=Generic.Al(driver).getText();
    	Generic.Al(driver).accept();
    	
    	int j=Excell_class.ccount();
    	if(text.contains("created success"))
    	{
    		Excell_class.writedata(j++, i, "Test passed");
    	}
    	
    	else if(text.contains("already EXists"))
    	{
    		Excell_class.writedata(j++, i, "Test Failed");
    	}
    	else
    	{
    		Excell_class.writedata(j++, i, "n/a");
    	}
    	}
    	
    	Excell_class.saveworkbook();
    }
    @Test(priority=4)
    public void verify_RoleDetails()
    {
    	Roles_Btn();
    }
    
    @Test(priority=5)    
    public void verify_NewRole()
    {
    	Excell_class.excelconnection("data.xls", "NewRole");
    	Excell_class.outputexcelconnection("data.xls", "output.xls", "NewRole");
    	for(int i=1;i<Excell_class.rcount(); i++ )
    	{
    		NewRole_Creation(Excell_class.readdata(0, i), Excell_class.readdata(1, i), Excell_class.readdata(2, i));
    		String text=Generic.Al(driver).getText();
    		Generic.Al(driver).accept();
    		
    		int j=Excell_class.ccount();
    		if(text.contains("Created Sucessfully"))
    		{
    			Excell_class.writedata(j++, i, "Test Passed");
    		}
    		else if(text.contains("Role Already existed"))
    		{
    			Excell_class.writedata(j++, i, "Test Failed");
    		}
    		else
    		{
    			Excell_class.writedata(j++, i, "N/A");
    		}
    		Excell_class.saveworkbook();
    		
    	}
    }
    @Test(priority=6)
    public void verify_EmployeeDetails()
    {
    	Employee_Btn();
    }
    @Test(priority=7)
    public void verify_NewEmployee()
    {
    	Excell_class.excelconnection("Data.xls", "NewEmployee");
    	Excell_class.outputexcelconnection("Data.xls", "output.xls", "NewEmployee");
    	for(int i=1; i<Excell_class.rcount(); i++)
    	{
    		NewEmployee_Creation(Excell_class.readdata(0, i), Excell_class.readdata(1, i), Excell_class.readdata(2, i), Excell_class.readdata(3, i));
    		String text=Generic.Al(driver).getText();
    		Generic.Al(driver).accept();
    		int j=Excell_class.ccount();
    		if(text.contains("Created Employer"))
    		{
    			Excell_class.writedata(j++, i, "Test Passed");
    		}
    		else if(text.contains("Employer"))
    		{
    			Excell_class.writedata(j++, i, "Test Failed");
    		}
    		else
    		{
    			Excell_class.writedata(j++, i, "N/A");
    		}
    		Excell_class.saveworkbook();
    		
    	}
    
    }
    @Test(priority=8)
    public void verify_Logout()
    {
    	Logout_Btn();    	
    }
    @Test(priority=9)
    public void verify_Users()
    {
    	Users_Btn();
    }
    
    */
    
}




