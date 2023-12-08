package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Example11_getCellType 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\wasdi\\OneDrive\\Desktop\\Software Testing\\files\\datanew.xlsx");
		 CellType ct = WorkbookFactory.create(file).getSheet("Sheet5").getRow(0).getCell(0).getCellType();
		 System.out.println(ct);
	}

}
