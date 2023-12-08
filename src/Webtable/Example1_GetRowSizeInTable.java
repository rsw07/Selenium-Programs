package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_GetRowSizeInTable
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/wasdi/OneDrive/Desktop/WebTable.html");
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='1234']//tr"));
		System.out.println(Rows.size());
		
		//driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		
	}

}
