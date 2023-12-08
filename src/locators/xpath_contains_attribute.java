//xpath by contains with attribute --> //tagname[contains(@attributename,'partial attribute value')]

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_contains_attribute 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'address')]")).sendKeys("abc");
		driver.findElement(By.xpath("//input[contains(@class,'_9npi')]")).sendKeys("xyz");
		driver.findElement(By.xpath("//button[contains(@class,'_4jy1')]")).click();
	}

}
