package com.actitime.testscript;

import java.time.Duration;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

import io.netty.handler.timeout.TimeoutException;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{

	@Test
	public void testCreateCustomer() throws Throwable {
		Reporter.log("CreateCustomer",true);
		FileLib f=new FileLib();
		String custName = f.getExcelData("CreateCustomer", 1, 3);
		String custDescription = f.getExcelData("CreateCustomer", 1, 4);
		HomePage h=new HomePage(driver);
		h.setTasksTab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewCustomerBtn().click();
		t.getEnterCustNameTbx().sendKeys(custName);
		t.getEnterCustDespTbx().sendKeys(custDescription);
		t.getSelectCustDD().click();
		t.getBigBangCompany().click();
		t.getCreateCustomerBtn().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		try 
		{
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
		}
		catch(TimeoutException e) {
			
		}
		
		wait.until(ExpectedConditions.textToBePresentInElement(t.getActualCustomerFld(), custName));
		
		String actualText = t.getActualCustomerFld().getText();
		Assert.assertEquals(actualText, custName);
	}
	
}
