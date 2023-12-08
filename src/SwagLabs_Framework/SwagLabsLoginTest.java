package SwagLabs_Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabsLoginTest 
{
	SwagLabsLoginPage login;
	SwagLabsHomePage Home;
	SwagLabsMenuPage Menu;
	Sheet sh;
	WebDriver driver;
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\wasdi\\OneDrive\\Desktop\\Software Testing\\Framework\\DDF_Excel_Sheet.xlsx");
		sh = WorkbookFactory.create(file).getSheet("Sheet1");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
		login = new SwagLabsLoginPage(driver);
		Home = new SwagLabsHomePage(driver);
		Menu = new SwagLabsMenuPage(driver);
	}
	
	@BeforeMethod
	public void LoginToApp()
	{
		login.inpSwagLabsLoginPageUN(sh.getRow(0).getCell(0).getStringCellValue());
		login.inpSwagLabsLoginPagePWD(sh.getRow(0).getCell(1).getStringCellValue());
		login.clickSwagLabsLoginPageLoginBtn();
	}
	
	@Test
	public void VerifyTitle()
	{
		String ActTitle = Home.getSwagLabsHomePageTitle();
		String ExpTitle=sh.getRow(0).getCell(2).getStringCellValue();
		Assert.assertEquals(ActTitle, ExpTitle,"Failed:Both the results are different");
		
		//Home.VerifySwagLabsHomePageTitle(sh.getRow(0).getCell(2).getStringCellValue());
	}
	
	@AfterMethod
	public void LogoutFromApp()
	{
		Home.ClickSwagLabsHomePageViewBtn();
		Menu.ClickSwagLabsMenuPageLogoutBtn();
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
	}

}
