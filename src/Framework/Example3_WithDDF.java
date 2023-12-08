package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_WithDDF 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream file = new FileInputStream("C:\\Users\\wasdi\\OneDrive\\Desktop\\Software Testing\\Framework\\DDF.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		//Enter Username 
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
		
		//Enter Password
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(500);
		
		//click on login
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(500);
		
		String Actual_title = driver.getTitle();
		String Expected_title = sh.getRow(0).getCell(2).getStringCellValue();
		if(Actual_title.equals(Expected_title))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case not passed");
		}
		Thread.sleep(500);
		driver.close();
	}

}