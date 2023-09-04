package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssertion {
@Test
public void verifytitle()
{

	WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    String etitle = "Soogle";
    String atitle = driver.getTitle();
    SoftAssert S=new SoftAssert();
    S.assertEquals(atitle,etitle);
    driver.close();
    S.assertAll();
    
}

	
}

