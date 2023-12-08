//Thread.sleep(TimeInMillisecond)-->waits for the time provided and it is mandatory to handle exception using throws or try-catch block

package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wait_operation 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver W = new ChromeDriver();     //opens Chrome Browser
		Thread.sleep(5000);                   //Waits for 2 seconds
		W.get("https://www.facebook.com/");   //opens facebook Url in the chrome browser
		Thread.sleep(5000);                   //Waits for 2 seconds
		W.close();           //Closes the tab
	}

}
