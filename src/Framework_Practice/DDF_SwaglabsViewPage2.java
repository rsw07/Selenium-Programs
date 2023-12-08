//POM Class-3

package Framework_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DDF_SwaglabsViewPage2 
{
	@FindBy(xpath="//a[text()='Logout']")private WebElement Logout;
	@FindBy(xpath="//button[text()='Open Menu']")private WebElement View;
	
	public DDF_SwaglabsViewPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickSwagLabViewPageLogoutBtn()
	{
		Logout.click();
	}
	

	public void clickSwagLabViewPageViewBtn()
	{
		View.click();
	}

}
