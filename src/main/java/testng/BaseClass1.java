package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass1 {
	@BeforeTest
	public void Openbrowser()
	{
		Reporter.log("Openbrowser",true);
	}
	@AfterTest
	public void Closebrowser()
	{
		Reporter.log("Closebrowser",true);
	}
	@BeforeMethod
	public void login() 
	{
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);	
	}

}
