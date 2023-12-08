//WAP to print Column size in a row
//getLastCellNum() => returns the column size

package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example5_columnsize 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\wasdi\\OneDrive\\Desktop\\Software Testing\\files\\datanew.xlsx");
		short ColSize = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getLastCellNum();
		System.out.println(ColSize);
	}

}
