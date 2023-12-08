//Close()   --> closes the tab on which selenium is focusing after completely loading an application.

package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_method 
{
	public static void main(String[] args) 
	{
		WebDriver w1 = new ChromeDriver();       //Opens the Chrome Browser
		w1.get("https://paytm.com/");        //opens the paytm url in the browser
		w1.close();                       //when paytm application loads completely it closes the paytm tab
		
	}

}
