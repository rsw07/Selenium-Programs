package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl_method
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.zomato.com/india");
		Thread.sleep(2000);
		
		String s = driver.getCurrentUrl();    //returns current webpage url and stores in variable
		System.out.println(s);                //prints url in console
		
		System.out.println(driver.getCurrentUrl());   //get the current webpage url and prints in console
		
		driver.close();
	}

}
