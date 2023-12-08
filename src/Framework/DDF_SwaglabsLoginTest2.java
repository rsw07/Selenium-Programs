package Framework;

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
		
		FileInputStream file = new FileInputStream("C:\\Users\\wasdi\\OneDrive\\Desktop\\Software Testing\\Framework\\DDF.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		DDF_SwaglabsLoginPage2 Login = new DDF_SwaglabsLoginPage2(driver);
		
		String UserName = sh.getRow(0).getCell(0).getStringCellValue();
		Login.inpSwagLabLoginPageUN(UserName);
		
		String PassWord = sh.getRow(0).getCell(1).getStringCellValue();
		Login.inpSwagLabLoginPagePWD(PassWord);
		Thread.sleep(2000);
		
		Login.clickSwagLabLoginPageLoginBtn();
		Thread.sleep(2000);
		
		
		DDF_SwaglabsHomePage2 Home = new DDF_SwaglabsHomePage2(driver);
		
		String Title = sh.getRow(0).getCell(2).getStringCellValue();
		Home.verifySwagLabHomePageTitle(Title);
		Home.clickSwagLabHomePageMenuBtn();
		Thread.sleep(2000);
		
		DDF_SwaglabsViewPage2 View = new DDF_SwaglabsViewPage2(driver);
		View.clickSwagLabViewPageLogoutBtn();
		Thread.sleep(2000);
		driver.close();
			
		
	}

}
