package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EncapLogInMainMethod {

	public static void main(String[] args) {
     WebDriver Driver = new ChromeDriver();
     Driver.get("https://www.actitime.com/");
     LoginPage L=new LoginPage(Driver);
     L.setLogin("Admin","Manager");
     Thread.sleep(40000);
     L.SetLogin("Admin","Manager");
     
	}

}
