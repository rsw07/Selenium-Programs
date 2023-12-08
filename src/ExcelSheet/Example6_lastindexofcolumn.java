package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example6_lastindexofcolumn 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\wasdi\\OneDrive\\Desktop\\Software Testing\\files\\datanew.xlsx");
		int Lastindexofcolumn = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getLastCellNum()-1;
		System.out.println(Lastindexofcolumn);
	}
}
