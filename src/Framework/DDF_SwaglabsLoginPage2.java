//POM Class-1

package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DDF_SwaglabsLoginPage2 
{
		
		@FindBy(xpath="//input[@id='user-name']")private WebElement UN;
		@FindBy(xpath="//input[@id='password']")private WebElement PWD;
		@FindBy(xpath="//input[@id='login-button']")private WebElement LoginBtn;
		
		public DDF_SwaglabsLoginPage2(WebDriver driver)
		{
			PageFactory.initElements(driver, this);  
		}
		
		public void  inpSwagLabLoginPageUN(String UserName)
		{
			UN.sendKeys(UserName);
		}
		
		public void inpSwagLabLoginPagePWD(String PassWord)
		{
			PWD.sendKeys(PassWord);
		}
		
		public void clickSwagLabLoginPageLoginBtn()
		{
			LoginBtn.click();
		}
	
	
	
	
	
	
}
