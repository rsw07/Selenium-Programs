//POM Class-2

package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwaglabsHomePage 
{
	@FindBy(xpath="//button[text()='Open Menu']")private WebElement view;
	
	WebDriver driver;       
	
	public SwaglabsHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		//globalVariable=localVariable -> assign local driver info into global driver
	}
	
	public void FetchTitle()
	{
		String acttitle = driver.getTitle();
		String exptitle = "Swag Labs";
		if(acttitle.equals(exptitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	public void clickonview()
	{
		view.click();
	}
}

