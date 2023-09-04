package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EncapsulationLogin {
	private WebElement untbx;
	private WebElement pwtbx;
	private WebElement Lgbtn;
	
	public void loginPage(WebDriver driver)
	{
		untbx=driver.findElement(By.id("username"));
		pwtbx=driver.findElement(By.name("pwd"));
		Lgbtn=driver.findElement(By.xpath("//div[text()='Login']"));
	}
	public void setlogin(String Un,String Pw)
	{
		untbx.sendKeys(Un);
		pwtbx.sendKeys(Pw);
		Lgbtn.click();
		
	}

}
