package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multipledata 
{
  public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
   {
	FileInputStream f=new FileInputStream("./excel/excel.xlsx");//path specified
	Workbook book=WorkbookFactory.create(f);//opening Excel
	Sheet s = book.getSheet("Sheet1");//opening Sheet
	
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver d1=new FirefoxDriver();
	Thread.sleep(2000);
	d1.get("https://www.amazon.in");
	Thread.sleep(2000);
	List<WebElement> links = d1.findElements(By.xpath("//a"));
	
	  for(int i=0;i<links.size();i++)
	   {
		 Row r = s.createRow(i);
		 Cell c = r.createCell(0);
		 c.setCellValue(links.get(i).getAttribute("href"));
	   }
	  FileOutputStream f1=new FileOutputStream("./excel/excel.xlsx");
	  book.write(f1);
	}

}
