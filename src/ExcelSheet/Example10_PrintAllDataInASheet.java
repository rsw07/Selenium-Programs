package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example10_PrintAllDataInASheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\wasdi\\OneDrive\\Desktop\\Software Testing\\files\\datanew.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		int lastrowindex = sh.getLastRowNum();
		//outer for loop for rows
		for(int i=0;i<=lastrowindex;i++)
		{
			int lastcolindex = sh.getRow(i).getLastCellNum()-1;
			//inner for loop for columns
			for(int j=0;j<=lastcolindex;j++)
			{
				System.out.print(sh.getRow(i).getCell(j).getStringCellValue()+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
