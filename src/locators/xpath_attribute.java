//facebook log in using xpath by attributes
//xpath by attribute -- > //tagname[@attributname='attributevalue']

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_attribute 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//Enter Username
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
		//Enter password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xyz");
		//click on log in
		driver.findElement(By.xpath("//button[@value='1']")).click();
	}

}
