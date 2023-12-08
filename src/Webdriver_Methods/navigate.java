//navigate()-->  use to open url in browser and perform forward,backward and refresh operation

package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver obj = new ChromeDriver();
		obj.navigate().to("https://www.zomato.com/india");   //opens zomato application in a browser
		
		Thread.sleep(2000);     //waits for 2 seconds
		
		obj.navigate().to("https://paytm.com/");    //opens paytm application in a same tab.
		Thread.sleep(2000);
		
		obj.navigate().back();    //navigate back to zomato
		Thread.sleep(2000);        //waits for 2 seconds
		
		obj.navigate().forward();  //navigate forward to paytm
		Thread.sleep(2000);        //waits for 2 seconds
		
		obj.navigate().refresh();   //refresh the page
		
		
	}

}
