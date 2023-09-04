package testng;

import java.io.File;
import java.io.IOException;
import java.rmi.Remote;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ExampleScreenShot {

	public void takescreenshot() throws IOException, Throwable {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //TakesScreenshot t=(TakesScreenshot)driver;
        RemoteWebDriver r= (RemoteWebDriver)driver;
        TakesScreenshot t = r;
        File src=t.getScreenshotAs(OutputType.FILE);
        File dest = new File("./screenshot/ss.png");
        FileUtils.copyFile(src,dest);
        Thread.sleep(5000);
        driver.close();
        
        
        
        
	}

}
