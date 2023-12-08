//POM Class-1

package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwaglabsLoginPage 
{
		
		@FindBy(xpath="//input[@id='user-name']")private WebElement UN;
		@FindBy(xpath="//input[@id='password']")private WebElement PWD;
		@FindBy(xpath="//input[@id='login-button']")private WebElement LoginBtn;
		
		public SwaglabsLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);  
		}
		
		public void EnterUN()
		{
			UN.sendKeys("standard_user");
		}
		
		public void EnterPWD()
		{
			PWD.sendKeys("secret_sauce");
		}
		
		public void clickLoginbtn()
		{
			LoginBtn.click();
		}
	
	
	
	
	
	
}
