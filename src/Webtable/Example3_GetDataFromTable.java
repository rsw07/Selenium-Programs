package Webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_GetDataFromTable
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/wasdi/OneDrive/Desktop/WebTable.html");
		WebElement Cell = driver.findElement(By.xpath("//table[@id='1234']//tr[3]//td[2]"));
		System.out.println(Cell.getText());
		
		
	}

}
