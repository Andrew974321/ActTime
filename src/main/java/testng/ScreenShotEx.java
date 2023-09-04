package testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShotEx {
	
        @Test
		public void takescreenshot() throws IOException, Throwable {
			WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com/");	     
	        TakesScreenshot t=(TakesScreenshot)driver;
	       /* RemoteWebDriver r= (RemoteWebDriver)driver;
	        TakesScreenshot t = r;*/
	        File src=t.getScreenshotAs(OutputType.FILE);
	        File dest = new File("./screenshot/ass.png");
	        FileUtils.copyFile(src,dest);
	        Thread.sleep(5000);
	        driver.close();

}
}
