package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1_getStringCellValue 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\wasdi\\OneDrive\\Desktop\\Software Testing\\files\\datanew.xlsx");
//		Workbook book =WorkbookFactory.create(file);
//		 Sheet s1 = book.getSheet("Sheet1");
//		 Row r =  s1.getRow(1);
//		 Cell c = r.getCell(0);
//		 String s = c.getStringCellValue();
//		 System.out.println(s);
		
		String s = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(s);
	}

}
