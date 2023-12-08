package HandlingOfMultipleElements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/wasdi/OneDrive/Desktop/MultipleCheckbox.html");
		List<WebElement> lw = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement w : lw)
		{
			w.click();
			Thread.sleep(500);
		}
		for(int i=lw.size()-1;i>=0;i--)
		{
			WebElement address = lw.get(i);
			address.click();
			Thread.sleep(500);
		}
		
		
	}

}
