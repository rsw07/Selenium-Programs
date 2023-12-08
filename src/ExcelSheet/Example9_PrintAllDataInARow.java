//WAP to print all data in a row 0

package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example9_PrintAllDataInARow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\wasdi\\OneDrive\\Desktop\\Software Testing\\files\\datanew.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		int LastCell = sh.getRow(0).getLastCellNum()-1;
		//for loop for column
		for(int i=0;i<=LastCell;i++)
		{
			System.out.print(sh.getRow(0).getCell(i).getStringCellValue()+" ");
		}
	}

}
