package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath="div[text()='Login']")
	private WebElement Lgbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
		
	}
	public void setlogin(String Un,String Pw)
	{
		untbx.sendKeys(Un);
		pwtbx.sendKeys(Pw);
		Lgbtn.click();
	}
	
	

}
