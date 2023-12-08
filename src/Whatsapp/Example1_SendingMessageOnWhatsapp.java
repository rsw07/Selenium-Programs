package Whatsapp;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_SendingMessageOnWhatsapp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_2vDPL']")).sendKeys("Aai");
		driver.findElement(By.xpath("//span[@title='Aai']")).click();
		driver.findElement(By.xpath("//div[@class='_3Uu1_']")).sendKeys("Hii");
		driver.findElement(By.xpath("//button[@aria-label='Send']")).click();
		driver.findElement(By.xpath("//span[@data-icon='menu']")).click();
		driver.findElement(By.xpath("//div[text()='Log out']")).click();
		driver.switchTo().alert().accept();
	}
}
