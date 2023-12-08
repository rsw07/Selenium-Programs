package HandlingOfMultipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_printingAllMobilesPrice 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Samsung M13");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> AllPrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for(WebElement price:AllPrice)
		{
			System.out.println(price.getText());
		}
	}

}
