//POM Class-3

package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DDF_SwaglabsViewPage2 
{
	@FindBy(xpath="//a[text()='Logout']")private WebElement Logout;
	
	public DDF_SwaglabsViewPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickSwagLabViewPageLogoutBtn()
	{
		Logout.click();
	}

}
