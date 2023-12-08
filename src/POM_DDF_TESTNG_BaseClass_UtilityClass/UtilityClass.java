package POM_DDF_TESTNG_BaseClass_UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass
{
	//@Author Name: Rashmi
	//This method is use to get Test data from excel sheet
	//need to pass 2 inputs 1:rowIndex 2:colIndex
	public static String getTestData(int rowindex,int columnindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\wasdi\\OneDrive\\Desktop\\Software Testing\\Framework\\DDF_Excel_Sheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		String TestData = sh.getRow(rowindex).getCell(columnindex).getStringCellValue();
		return TestData;
	}
	
	public static void Screenshot(WebDriver driver) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\wasdi\\eclipse-workspace\\Selenium\\SS_FailedTC\\ScreenshotTC1.JPG");
		FileHandler.copy(src, dest);
	}

}