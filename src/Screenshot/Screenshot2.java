package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot2 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);   //prints te path of stored screenshot
		File dest = new File("C:\\Users\\wasdi\\OneDrive\\Desktop\\Software Testing\\Screenshots\\screen3.jpg");
		FileHandler.copy(src, dest);
	}

}
