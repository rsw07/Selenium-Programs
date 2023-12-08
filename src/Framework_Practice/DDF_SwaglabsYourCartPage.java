package Framework_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DDF_SwaglabsYourCartPage 
{
	@FindBy(xpath="//div[@class='inventory_item_name']")private WebElement InCartProduct;
	@FindBy(xpath="//span[contains(@class,'fa-layers')]")private WebElement CountOfProductsInCart;
	public DDF_SwaglabsYourCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void verifySwagLabYourCartPageInCartProduct(String ExpectedText)
	{
		String ActualText = InCartProduct.getText();
		if(ActualText.equals(ExpectedText))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
	public void getCountofProductsInCart()
	{
		try
		{
			String Count = CountOfProductsInCart.getText();
			System.out.println("Total no.of Products added in cart is: "+Count);
		}
		
		catch(Exception e)
		{
			System.out.println("No elements added in cart");
		}
	}
	
	
}
