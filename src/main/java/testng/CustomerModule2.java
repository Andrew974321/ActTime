package testng;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModule2 {
	@BeforeClass
	public void OpenBrowser()
	{
		Reporter.log("OpenBrowser",true);
	}
	@AfterClass
	public void CloseBrowser()
	{
		Reporter.log("CloseBrowser",true);	
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("Login",true);		
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("Logout",true);	
	}
	@Test(priority=1,invocationCount=2)
	public void editcustomer()
	{
		Reporter.log("editcustomer",true);
	}
	@Test
	public void RegisterCustomer()
	{
		Reporter.log("RegisterCustomer",true);
	}
	@Test
	public void DeleteCustomer()
	{
		Reporter.log("DeleteCustomer",true);
	}

}
