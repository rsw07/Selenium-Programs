package HandlingofDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_MoveToElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		//Step1 : Identify WebElement and store it into referenced variable
		WebElement Al = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		//Step2 : create the object of Actions class with webdriver object as a input
		Actions act = new Actions(driver);
		
		//Step3 : call the methods of Actions class
		act.moveToElement(Al).perform();
		Thread.sleep(2000);
		driver.close();
	}

}
