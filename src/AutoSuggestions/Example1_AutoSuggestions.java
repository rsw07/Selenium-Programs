package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example1_AutoSuggestions
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Samsung");
		Thread.sleep(2000);
		List<WebElement> AllSuggestions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		String ExpText = "Samsung Galaxy A54 5G";
		for(WebElement option:AllSuggestions)
		{
			String s = option.getText();
			if(s.equals(ExpText))
			{
				option.click();
				break;
			}
		}
		
	
	}

}
