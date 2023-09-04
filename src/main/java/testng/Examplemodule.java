package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Examplemodule {
@Beforeclass
public void OpenBrowser()
{
	Reporter.log("OpenBrowser",true);
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
@Test(priority=1,invocationCount=2)
public void editcustomer() {
	Reporter.log("editcustomer",true);	
}
@Test
public void registercustomer()
{
	Reporter.log("registercustomer",true);	
	
}
@Test
public void deletecustomer()
{
	Reporter.log("deletecustomer",true);		
}

}
