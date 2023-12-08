//quit()  --> it closes all tabs/entire browser

package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quit_method 
{
	public static void main(String[] args) 
	{
		WebDriver W5 = new ChromeDriver();   //opens chrome browser
		W5.get("https://paytm.com/");        //opens paytm url in browser
		W5.quit();                           //closes all tabs/entire browser
		
	}

}
