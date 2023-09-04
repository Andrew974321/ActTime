package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActualAndExpectedValue {
@Test
public void verifytitle()
{
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    String etitle = "Soogle";
    String atitle = driver.getTitle();
    Assert.assertEquals(atitle,etitle);
    driver.close();
    
}
}
