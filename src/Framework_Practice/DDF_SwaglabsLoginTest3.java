
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

public class DDF_SwaglabsLoginTest3
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
		
		String Password = sh.getRow(0).getCell(1).getStringCellValue();
		LoginPage.inpSwagLabLoginPagePWD(Password);
		
		LoginPage.clickSwagLabLoginPageLoginBtn();
		
		Thread.sleep(2000);
		DDF_SwaglabsHomePage2 HomePage = new DDF_SwaglabsHomePage2(driver);
		
		HomePage.clickSwagLabHomePageAddToCart();
		Thread.sleep(2000);
		
		HomePage.clickSwagLabHomePageYourCartLogo();
		Thread.sleep(2000);
		
		String ExpectedText = sh.getRow(0).getCell(4).getStringCellValue();
		DDF_SwaglabsYourCartPage ProductInCart = new DDF_SwaglabsYourCartPage(driver);
		ProductInCart.verifySwagLabYourCartPageInCartProduct(ExpectedText);
		
		DDF_SwaglabsViewPage2 ViewPage = new DDF_SwaglabsViewPage2(driver);
		ViewPage.clickSwagLabViewPageViewBtn();
		ViewPage.clickSwagLabViewPageLogoutBtn();
		
		
		ViewPage.clickSwagLabViewPageViewBtn();
		Thread.sleep(2000); 
		
		ViewPage.clickSwagLabViewPageLogoutBtn();
		Thread.sleep(2000);
		driver.close();
	}

}
