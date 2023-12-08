//POM Class-2

package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DDF_SwaglabsHomePage2 
{
	@FindBy(xpath="//button[text()='Open Menu']")private WebElement view;
	
	WebDriver driver;       
	
	public DDF_SwaglabsHomePage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		//globalVariable=localVariable -> assign local driver info into global driver
	}
	
	public void verifySwagLabHomePageTitle(String Title)
	{
		String acttitle = driver.getTitle();
		String exptitle = Title;
		if(acttitle.equals(exptitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	public void clickSwagLabHomePageMenuBtn()
	{
		view.click();
	}
}

