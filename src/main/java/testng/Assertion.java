package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class Assertion {
	  @Test
	  public void VerifyTitle() {
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	    String etitle = "Soogle";
	    String atitle = driver.getTitle();
	    if (atitle.equals(etitle))
	    {
	      Reporter.log("Title is matching and pass", true);
	    }else
	    {
	      Reporter.log("Title is not matching and fail", true);
	    }
	    driver.close();
	  }
	}


