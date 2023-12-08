package HandlingofDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example4_RightClickOnElement 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.xpath("(//a[@class='nav-a  '])[7]"));
		Actions act = new Actions(driver);
		
//		act.moveToElement(ele).perform();
//		act.contextClick().perform();
		
//		act.moveToElement(ele).contextClick().perform();
		
		act.contextClick(ele).perform();;
	}

}
