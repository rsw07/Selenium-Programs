package Popups;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		Set<String> s =driver.getWindowHandles();
		ArrayList<String> a = new ArrayList(s);
		driver.switchTo().window(a.get(1));    //swich to child browser popup
		
		driver.findElement(By.xpath("(//span[@class='menu-text'])[22]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(a.get(0));    //Switch to main page
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Set<String> allIds1 = driver.getWindowHandles(); 
		//{mainPageID, ChildWindowID1,childWindow2}
		ArrayList<String> al2=new ArrayList<String>(a); 
		//{mainPageID(0), ChildWindowID(1), childWindow2(2)}
		//switch to 2nd child window
		driver.switchTo().window(al2.get(2));
		driver.findElement(By.xpath("//a[@class='dt-mobile-menu-icon']")).click();
		
	}

}
