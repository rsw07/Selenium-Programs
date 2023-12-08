package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_SwitchToFrame 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//Switch from main page to iframe
		driver.switchTo().frame("iframeResult");   //1.using name attribute value
		//driver.switchTo().frame("iframeResult");   //2.using id attribute value
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));//3.using frame webelement          
		//driver.switchTo().frame(2);                  //4. using iframe index (Not recommended)
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
		//To switch from iframe to main frame
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		
		
		
	}

}
