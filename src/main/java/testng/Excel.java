package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {

	public static void main(String[] args) throws Throwable {
    FileInputStream fis =new FileInputStream("./data/Newsheet.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
   
    for(int i=1;i<=5;i++)
    {
    	   String username=wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
    	   int password =(int) wb.getSheet("Sheet1").getRow(i).getCell(2).getNumericCellValue();
    	   System.out.println(username+"   "+password); 	
    }
	
	
    
  
     
   
    
   
    
    
    
    
    
  
    
	}

}
