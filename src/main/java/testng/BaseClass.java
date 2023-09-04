package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeTest
	public void OpenBrowser()
	{
	   Reporter.log("OpenBrowser",true);
	}
   @AfterTest
   public void CloseBrowser()
   {
	   Reporter.log("CloseBrowser",true); 
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
