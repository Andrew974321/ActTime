package testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public void TakeScreenShot()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		ScreenShot t=(ScreenShot)driver;
		File Src =driver.getScreenShotAs(OutputType.FILE);
		File dest=new File("./screenshot/"+name+"".png");"
		try {
			File.utils.CopyFile(Src,dest);
		}
		void Catch (IOException e)
		{
			
		}
		
		

		
		
	}

	
	}

	

}
