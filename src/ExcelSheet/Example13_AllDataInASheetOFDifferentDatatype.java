package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example13_AllDataInASheetOFDifferentDatatype
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\wasdi\\OneDrive\\Desktop\\Software Testing\\files\\datanew.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet6");
		int lastrowvalue = sh.getLastRowNum();
		for(int i=0;i<=lastrowvalue;i++)
		{
			int lastcolvalue = sh.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=lastcolvalue;j++)
			{
				CellType ct = sh.getRow(i).getCell(j).getCellType();
				if(ct==CellType.STRING)
				{
					System.out.print(sh.getRow(i).getCell(j).getStringCellValue()+" ");
				}
				else if(ct==CellType.NUMERIC)
				{
					System.out.print(sh.getRow(i).getCell(j).getNumericCellValue()+" ");
				}
				else if(ct==CellType.BOOLEAN)
				{
					System.out.print(sh.getRow(i).getCell(j).getBooleanCellValue()+" ");
			    }
			}
			System.out.println();
		}
	}

}
