package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

	@FindBy(id="username")
	public WebElement untbx;
	
	@FindBy(name="pwd")
	public WebElement pw;
	
	@FindBy(xpath="//div[text()='Login ']")
	public WebElement lgbtn;
	
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements( driver, this);
	}
	public void setLogin(String un,String pwd)
	{
		untbx.sendKeys(un);
		pw.sendKeys(pwd);
		lgbtn.click();
		
	}
}
