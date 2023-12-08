//WAP to print all data in a column 0

package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example8_PrintAllDataInAColumn 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\wasdi\\OneDrive\\Desktop\\Software Testing\\files\\datanew.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		//for loop for Row
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			System.out.println(sh.getRow(i).getCell(0).getStringCellValue());
		}
	}

}
