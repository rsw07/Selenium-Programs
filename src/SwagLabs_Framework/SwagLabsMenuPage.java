//POM Class-3

package SwagLabs_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsMenuPage 
{
	@FindBy(xpath="//a[text()='Logout']")private WebElement LogoutBtn;
	
	public SwagLabsMenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickSwagLabsMenuPageLogoutBtn()
	{
		LogoutBtn.click();
	}

}
