//POM Class-1

package Framework_Practice;

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
		@FindBy(xpath="//h3[@data-test='error']")private WebElement ActError;
		@FindBy(xpath="//div[@id='login_button_container']//h3")private WebElement ErrorMsg;
		
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
		
		public void verifySwagLabLoginPageErrorMsg(String ExpError)
		{
			String ExpErrorMsg = ExpError;
			String ActErrorMsg = ActError.getText() ;
			if(ExpErrorMsg.equals(ActErrorMsg))
			{
				System.out.println(ActErrorMsg);
				System.out.println("TC Pass");
			}
			else
			{
				System.out.println("TC Fail");
			}
			
		}
	
	
	
	
	
}
