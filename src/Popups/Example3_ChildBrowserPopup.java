package Popups;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_ChildBrowserPopup 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> IDs = driver.getWindowHandles();
		ArrayList<String> arr = new ArrayList(IDs);
		
		String MainPageId = arr.get(0);        //Main page id
		String ChildWindowID = arr.get(1);      //Child window id
				
		driver.switchTo().window(ChildWindowID); //To switch selenium focus from main pag to child  window
		
		driver.findElement(By.xpath("//span[text()='Watch free courses']")).click();
		
		driver.close();
	}

}
