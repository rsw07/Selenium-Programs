package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example7_firstselected_singleselectable 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		WebElement w = driver.findElement(By.xpath("//select[@id='year']"));
		Select s = new Select(w);
		s.selectByValue("2000");
		WebElement web = s.getFirstSelectedOption();
		System.out.println(web.getText());
	}

}
