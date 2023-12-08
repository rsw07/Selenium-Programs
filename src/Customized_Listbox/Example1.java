package Customized_Listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//step1 - identify customized listbox and store it into reference variable
		WebElement ele = driver.findElement(By.xpath("//select[@id='month']"));
		
		//step2 - create the object of actions class
		Actions act = new Actions(driver);
		
		//step3 - use actions class method to open the listbox option
		act.click(ele).perform();;
		Thread.sleep(2000);
		
		//step4-A  - navigate from nov to sep using ARROW_UP key
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_UP).perform();;
		Thread.sleep(500);
		
		//step4-B  - navigate from sep to oct using ARROW_UP key
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		
		//step4-C - Select option using ENTER key
		act.sendKeys(Keys.ENTER).perform();;
	}

}
