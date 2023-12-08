package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_SizeOfAllCheckboxes
{
	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/wasdi/OneDrive/Desktop/MultipleCheckbox.html");
		List<WebElement> lw = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int size = lw.size();
		System.out.println(size);
		
		
	}

}
