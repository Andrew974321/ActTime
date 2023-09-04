package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModulee {
	@Test
	public void createcustomer()
	{
		Reporter.log("createcustomer",true);
		
	}
	@Test
	public void modifycustomer()
	{
		Reporter.log("Modifycustomer",true);
		
	}
	@Test
	public void deletecustomer()
	{
		Reporter.log("deletecustomer",true);
		
	}
