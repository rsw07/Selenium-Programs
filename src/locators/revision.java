package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class revision 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ABC");     //Xpath by attribute
		driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("xyz");  //xpath by contains with attribute
		driver.findElement(By.xpath("//button[text()='Log in']")).click();            //xpath by text
		
		
	}
	

}
