package DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Samsung M13");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement review = driver.findElement(By.xpath("(//div[@class='a-row a-size-small']//span)[4]"));
		System.out.println(review.getText());
	}
}
