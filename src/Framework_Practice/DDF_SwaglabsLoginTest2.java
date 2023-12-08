package Framework_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDF_SwaglabsLoginTest2 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(2000);
		
		FileInputStream file = new FileInputStream("C:\\Users\\wasdi\\OneDrive\\Desktop\\Software Testing\\Framework\\DDF_Excel_Sheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		DDF_SwaglabsLoginPage2 LoginPage = new DDF_SwaglabsLoginPage2(driver);
		
		String UserName = sh.getRow(0).getCell(0).getStringCellValue();
		LoginPage.inpSwagLabLoginPageUN(UserName);
		
		LoginPage.clickSwagLabLoginPageLoginBtn();
		Thread.sleep(2000);
		
		String ErrorMsg = sh.getRow(0).getCell(3).getStringCellValue();
		LoginPage.verifySwagLabLoginPageErrorMsg(ErrorMsg);
		
		DDF_SwaglabsHomePage2 HomePage = new DDF_SwaglabsHomePage2(driver);
		HomePage.clickSwagLabHomePageAddToCart();
	}

}
