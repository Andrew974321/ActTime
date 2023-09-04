package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile {

	public static void main(String[] args) throws Throwable   {
		FileInputStream fis =new FileInputStream("./data/Notepad.property");
		Properties p =new Properties();
		p.load(fis);
		String url =p.getProperty("url");
		String Un=p.getProperty("username");
		String pw=p.getProperty("password");
		System.out.println(url);
		System.out.println(Un);
		System.out.println(pw);
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
        driver.findElement(By.name("email")).sendKeys(Un);
        driver.findElement(By.name("pass")).sendKeys(pw);
        driver.findElement(By.name("login")).click();
        
        
       p.setProperty("username","abcd");
       p.setProperty("password","12345");
       String ur =p.getProperty("url");
		String U=p.getProperty("username");
		String w=p.getProperty("password");
		System.out.println(ur);
		System.out.println(U);
		System.out.println(w);
       
       
		
		
		
	
		
		

	}

}
