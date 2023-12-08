package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_AlertPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("101");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);
		//To Switch from main page to alert popup
		Alert alt = driver.switchTo().alert();
		
		//To get text from alert popup
		String s = alt.getText();	
		System.out.println(s);
		
		//To click on cancel button in popup
		//alt.dismiss();
		//driver.switchTo().alert().dismiss();
		
		//To click on OK button in popup
		//driver.switchTo().alert().accept();
		alt.accept();
		Thread.sleep(2000);
		
		//To click on OK button of 2nd popup
		alt.accept();
		
		
	}

}
