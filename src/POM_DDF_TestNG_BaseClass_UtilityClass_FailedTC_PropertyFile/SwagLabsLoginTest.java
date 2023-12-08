package POM_DDF_TestNG_BaseClass_UtilityClass_FailedTC_PropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
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
	int TCID;
	
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
		login.inpSwagLabsLoginPageUN(UtilityClass.GetDataFromPropertyFile("UN"));
		login.inpSwagLabsLoginPagePWD(UtilityClass.GetDataFromPropertyFile("PWD"));
		login.clickSwagLabsLoginPageLoginBtn();
	}
	
	@Test
	public void VerifyTitle() throws EncryptedDocumentException, IOException
	{
		TCID=101;
		String ActTitle = Home.getSwagLabsHomePageTitle();
		String ExpTitle=UtilityClass.getTestData(0, 2);
		Assert.assertEquals(ActTitle, ExpTitle,"Failed:Both the results are different");
	}
	
	@AfterMethod
	public void LogoutFromApp(ITestResult s1) throws IOException
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			//Code to capture the screenshot
			UtilityClass.Screenshot(driver,TCID);
		}
		Home.ClickSwagLabsHomePageViewBtn();
		Menu.ClickSwagLabsMenuPageLogoutBtn();
		
		
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
	}

}
