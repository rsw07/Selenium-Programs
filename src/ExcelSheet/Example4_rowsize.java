//WAP to print row size in an excel sheet
//getLastRowNum() => returns the index of last row

package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example4_rowsize 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\wasdi\\OneDrive\\Desktop\\Software Testing\\files\\datanew.xlsx");
		int rowsize = WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum()+1; 
		System.out.println(rowsize);
	}

}
