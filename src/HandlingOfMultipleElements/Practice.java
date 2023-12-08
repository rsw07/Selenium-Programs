package HandlingOfMultipleElements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/wasdi/OneDrive/Desktop/MultipleCheckbox.html");
		List<WebElement>AllCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("No.of Checkboxes present: "+AllCheckboxes.size());
	
		for(WebElement checkbox:AllCheckboxes)
		{
			checkbox.click();
			Thread.sleep(500);
			
		}
		
		for(int i=AllCheckboxes.size()-1;i>=0;i--)
		{
			AllCheckboxes.get(i).click();
			Thread.sleep(500);
			
		}
		
	}
}