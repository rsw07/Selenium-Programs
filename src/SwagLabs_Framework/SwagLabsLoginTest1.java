////Test Class
//
//package SwagLabs_Framework;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.time.Duration;
//
//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class SwagLabsLoginTest1
//{
//	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
//	{
//		
//		
//		String UserName = sh.getRow(0).getCell(0).getStringCellValue();
//		login.inpSwagLabsLoginPageUN(UserName);
//		
//		Thread.sleep(1000);
//		
//		login.inpSwagLabsLoginPagePWD(sh.getRow(0).getCell(1).getStringCellValue());
//		
//		Thread.sleep(1000);
//		
//		login.clickSwagLabsLoginPageLoginBtn();
//		
//		
//		
//		String ExpectedTitle = sh.getRow(0).getCell(2).getStringCellValue();
//		Home.VerifySwagLabsHomePageTitle(ExpectedTitle);
//		Home.ClickSwagLabsHomePageViewBtn();
//		Thread.sleep(1000);
//		
//		
//		Menu.ClickSwagLabsMenuPageLogoutBtn();
//		
//		Thread.sleep(2000);
//		
//		driver.close();
//	}
//
//}
