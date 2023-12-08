package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_GetColumnSizeInRow 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/wasdi/OneDrive/Desktop/WebTable.html");
		
		List<WebElement> Columns_Row1 = driver.findElements(By.xpath("//table[@id='1234']//tr[1]//th"));
		System.out.println("Column size of Row 1: "+Columns_Row1.size());
		
		int Columns_Row3=driver.findElements(By.xpath("//table[@id='1234']//tr[3]//td")).size();
		System.out.println("Column size of Row 1: "+Columns_Row3);
		driver.close();
	}

}
