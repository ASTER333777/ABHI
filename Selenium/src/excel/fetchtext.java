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

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchtext 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream f=new FileInputStream("./excel/excel.xlsx");//Step1 Specify the path
		Workbook book=WorkbookFactory.create(f);//Step2 
		Sheet s = book.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String value = c.getStringCellValue();
		System.out.println(value);
	}

}
