/*tagname --> drawback- if we have multiple elements with same tagname the it performs action on 
first element having that particular tagname
*/

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname_
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/wasdi/OneDrive/Desktop/Software%20Testing/Automation/HTML/tagname.html");
		driver.findElement(By.tagName("input")).sendKeys("abc");    //Username
		driver.findElement(By.tagName("input")).sendKeys("xyz");    //password
	}

}
