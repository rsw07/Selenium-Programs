package Customized_Listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2_Select07date
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Actions act = new Actions(driver);
		act.click(day).perform();
		for(int i=1;i<=14;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();;
			Thread.sleep(300);
		}
		act.sendKeys(Keys.ENTER).perform();;
		
		
	}

}
