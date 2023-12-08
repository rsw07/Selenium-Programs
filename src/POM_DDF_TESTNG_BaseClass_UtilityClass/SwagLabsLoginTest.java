package POM_DDF_TESTNG_BaseClass_UtilityClass;

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

public class SwagLabsLoginTest extends BaseClass
{
	SwagLabsLoginPage login;
	SwagLabsHomePage Home;
	SwagLabsMenuPage Menu;
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		InitializeBrowser();
		
		login = new SwagLabsLoginPage(driver);
		Home = new SwagLabsHomePage(driver);
		Menu = new SwagLabsMenuPage(driver);
	}
	
	@BeforeMethod
	public void LoginToApp() throws EncryptedDocumentException, IOException
	{
		login.inpSwagLabsLoginPageUN(UtilityClass.getTestData(0, 0));
		login.inpSwagLabsLoginPagePWD(UtilityClass.getTestData(0, 1));
		login.clickSwagLabsLoginPageLoginBtn();
	}
	
	@Test
	public void VerifyTitle() throws EncryptedDocumentException, IOException
	{
		String ActTitle = Home.getSwagLabsHomePageTitle();
		String ExpTitle=UtilityClass.getTestData(0, 2);
		Assert.assertEquals(ActTitle, ExpTitle,"Failed:Both the results are different");
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
