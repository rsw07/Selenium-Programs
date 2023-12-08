//POM Class-1

package POM_DDF_TestNG_BaseClass_UtilityClass_FailedTC_PropertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage 
{
	//Step-1: Declaration
	@FindBy(xpath="//input[@id='user-name']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//input[@id='login-button']")private WebElement LoginBtn;
	
	//Step-2: Initialization
	public SwagLabsLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Create method for each variable
	public void inpSwagLabsLoginPageUN(String UserName)
	{
		UN.sendKeys(UserName);
	}
	
	public void inpSwagLabsLoginPagePWD(String Password)
	{
		PWD.sendKeys(Password);
	}
	
	public void clickSwagLabsLoginPageLoginBtn()
	{
		LoginBtn.click();
	}
	
	

}
