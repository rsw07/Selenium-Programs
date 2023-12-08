package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example2_Autosuggestions
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("paragon");
		Thread.sleep(2000);
		String exp = "paragon shoes";
		List<WebElement> AllOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		for(WebElement option:AllOptions)
		{
			String s = option.getText();
			if(s.equals(exp))
			{
				option.click();
				break;
			}
		}
	
	}

}