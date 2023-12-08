//getTitle() --> returns title of webpage as a string output

package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle_method
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();   //opens chrome browser   
		Thread.sleep(2000);         //waits for 2 seconds
		
		driver.get("https://www.facebook.com/");  //opens facebook webpage on chromebrowser
		Thread.sleep(2000);         //waits for 2 seconds
		
		String s = driver.getTitle();    //returns title of webpage as a string output
		System.out.println(s);           //prints title
		
		driver.close();              //closes browser
	}

}
