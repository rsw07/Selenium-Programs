//WAP to find count of elements in cart and empty if no elements present

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

public class DDF_SwagLabsLoginTest4 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/");
		
		FileInputStream file = new FileInputStream("C:\\Users\\wasdi\\OneDrive\\Desktop\\Software Testing\\Framework\\DDF_Excel_Sheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		DDF_SwaglabsLoginPage2 login = new DDF_SwaglabsLoginPage2(driver);
		
		String UserName = sh.getRow(0).getCell(0).getStringCellValue();
		login.inpSwagLabLoginPageUN(UserName);
		
		String Password = sh.getRow(0).getCell(1).getStringCellValue();
		login.inpSwagLabLoginPagePWD(Password);
		
		login.clickSwagLabLoginPageLoginBtn();
		
		Thread.sleep(2000);
		DDF_SwaglabsHomePage2 HomePage = new DDF_SwaglabsHomePage2(driver);
		
//		HomePage.clickSwagLabHomePageAddToCart();
//		Thread.sleep(2000);
		
		DDF_SwaglabsYourCartPage cart = new DDF_SwaglabsYourCartPage(driver);
		cart.getCountofProductsInCart();

	}

}
