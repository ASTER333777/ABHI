package excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Entertext 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream f=new FileInputStream("./excel/excel.xlsx");//Step1 Specify the path
		Workbook book=WorkbookFactory.create(f);//Step2 
		Sheet s = book.getSheet("Sheet1");
		Row c = s.createRow(0);
		Cell r = c.createCell(0);
		r.setCellValue("HEY ABHI");
		FileOutputStream fout=new FileOutputStream("./excel/excel.xlsx");
		book.write(fout);
	}

}
