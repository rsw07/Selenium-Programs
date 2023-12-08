package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example12_GetDataByVerifyingTypeOfCell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\wasdi\\OneDrive\\Desktop\\Software Testing\\files\\datanew.xlsx");
		Cell c = WorkbookFactory.create(file).getSheet("Sheet5").getRow(0).getCell(0);
		CellType ct = c.getCellType();
		
		if(ct==CellType.STRING)
		{
			String val = c.getStringCellValue();
			System.out.println(val);
		}
		else if(ct==CellType.BOOLEAN)
		{
			Boolean val = c.getBooleanCellValue();
			System.out.println(val);
		}
		else if(ct==CellType.NUMERIC)
		{
			double val = c.getNumericCellValue();
			System.out.println(val);
		}
	
	}
}
