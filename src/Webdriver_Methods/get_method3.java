//get()

package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class get_method3
{
	public static void main(String[] args)
	{
		WebDriver obj3 = new EdgeDriver();
		obj3.get("https://paytm.com/");        //opens URL in tab
		obj3.get("https://www.facebook.com/");   //make changes in the same tab
		
	}

}
