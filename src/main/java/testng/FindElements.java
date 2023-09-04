package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
    WebDriver driver =new ChromeDriver();
    driver.get("https://www.amazon.in/");
   List<WebElement> l = driver.findElements(By.xpath("//a"));

  int count = l.size();
  System.out.println(count);
 /* for(int i=0;i<count;i++) {
	//String text = l.get(i).getText();
	//System.out.println(text);
  }*/
  
  for(WebElement rod:l)
  {
	 String team = rod.getText();
	 System.out.println(team);
  }
  
	}
}


