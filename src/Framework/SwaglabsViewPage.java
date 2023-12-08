//POM Class-3

package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwaglabsViewPage 
{
	@FindBy(xpath="//a[text()='Logout']")private WebElement Logout;
	
	public SwaglabsViewPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonlogout()
	{
		Logout.click();
	}

}
