package HandlingofDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example6_DragAndDrop 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//step1 : Identify source and destination element and store it into referenced variable
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions act = new Actions(driver);
		
		//drag and drop operation using Action class method dragAndDrop
		//act.dragAndDrop(src, dest).perform();
		
		//Alternate solution for drag and drop without using dragAndDrop method
		act.moveToElement(src).clickAndHold().moveToElement(dest).release().perform();
	}

}
