package HandlingofDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example3_ClickOnElement
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//a[@class='nav-a  '])[5]"));
		Actions act = new Actions(driver);
		
//		act.moveToElement(ele).perform();
//		act.click().perform();
		
//		act.moveToElement(ele).click().perform();
		
		act.click(ele).perform();;
		
		
		
	}

}
