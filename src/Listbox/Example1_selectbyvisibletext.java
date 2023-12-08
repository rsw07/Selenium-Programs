package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1_selectbyvisibletext 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		Thread.sleep(2000);
		
		//Step-1 =>Identify an element which needs to be handled and store it into a referenced variable
		WebElement w  = driver.findElement(By.xpath("//select[@id='month']"));
		
		//step-2 => Create the object of select class which accepts the webelement object as a parameter
		Select s = new Select(w);
		
		//step-3 => use the select class methods to select options of listbox
		s.selectByVisibleText("Dec");    //selectByVisibleText => selects the month as dec
		
		
	}

}
