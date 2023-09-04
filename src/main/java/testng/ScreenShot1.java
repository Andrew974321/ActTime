package testng;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot1 {
	public void TakeScreenshot()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		ScreenShot t =(ScreenShot)driver;
		File Src=t.getScreenShotAs(OutputType.FILE);
	}

}
