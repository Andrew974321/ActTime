package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass2 {
	public WebDriver driver;
	@BeforeTest
	public void Openbrowser()
	{
		Reporter.log("Openbrowser",true);
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterTest
	public void Closebrowser()
	{
		Reporter.log("Closebrowser",true);	
		driver.close();
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);	
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("Manager");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}

}
