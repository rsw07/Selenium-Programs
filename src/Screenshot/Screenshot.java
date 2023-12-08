package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();          //opens chrome browser
		driver.get("https://www.zomato.com/india");     //opens the zomato application
		//Step1 => to type cast driver object with TakesScreenshot interface
		TakesScreenshot ts =((TakesScreenshot)driver); 
		//step2 => to call method of takesScreenshot interface i.e.getScreenshotAs with outputtype as a parameter
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//To store screenshot to a local driver
		//step3 => create destination file with destination path
		File f = new File("C:\\Users\\wasdi\\OneDrive\\Desktop\\Software Testing\\Screenshots\\screen2.jpg");
		//step4 => To copy file from source to destination
		FileHandler.copy(src, f);
		
	}


}
