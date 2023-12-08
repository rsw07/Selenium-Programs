//POM Class-2

package POM_DDF_TESTNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage 
{
	WebDriver driver;    //global variable declaration
	
	@FindBy(xpath="//button[text()='Open Menu']")private WebElement ViewBtn;
	
	public SwagLabsHomePage(WebDriver driver)
	{
		this.driver = driver;     //this.globalvariable = localvariable
		PageFactory.initElements(driver, this);
	}
	
//	public void VerifySwagLabsHomePageTitle(String ExpectedTitle)
//	{
//		String ExpTitle = ExpectedTitle;
//		String ActTitle = driver.getTitle();
//		
//		if(ExpTitle.equals(ActTitle))
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
//	}
	
	public String getSwagLabsHomePageTitle()
	{
		String ActTitle = driver.getTitle();
		return ActTitle;
	}
	
	public void ClickSwagLabsHomePageViewBtn()
	{
		ViewBtn.click();
	}

}
