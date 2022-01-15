package excel;

import java.io.FileInputStream;
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

public class Readmultipledata 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	   {
		FileInputStream f=new FileInputStream("./excel/excel.xlsx");
		Workbook book=WorkbookFactory.create(f);
		Sheet s = book.getSheet("Sheet1");
		
	      for(int i=0;i<s.getLastRowNum();i++)
		   {
			 Row r = s.createRow(i);
			 
			  for(int j=0;j<r.getLastCellNum();j++)
			   {
				 System.out.println(r.getCell(j).getStringCellValue());
		   }
			  System.out.println(i.getStringCellValue());
		}

	}

}