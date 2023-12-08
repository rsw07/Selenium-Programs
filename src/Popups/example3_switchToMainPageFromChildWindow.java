package Popups;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class example3_switchToMainPageFromChildWindow
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://skpatro.github.io/demo/links/");
	//click on "NewTab" from home page
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	//get child window ID
	Set<String> allIds = driver.getWindowHandles(); 
	//{mainPageID, ChildWindowID}
	ArrayList<String> al=new ArrayList<String>(allIds); 
	//{mainPageID(0), ChildWindowID(1)}
	//switch to child window
	driver.switchTo().window(al.get(1)); //String childWindowID
	//click on Training link from childWindow
	driver.findElement(By.xpath("//span[text()='Training']")).click();
	Thread.sleep(2000);
	//switch to main page
	driver.switchTo().window(al.get(0));
	Thread.sleep(2000);
	//click on "NewWindow" btn from main page
	driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	// Set<String> allIds1 = driver.getWindowHandles(); 
	//{mainPageID, ChildWindowID1,childWindow2}
	// ArrayList<String> al2=new ArrayList<String>(allIds); 
	//{mainPageID(0), ChildWindowID(1), childWindow2(2)}
	//switch to 2nd child window
	// driver.switchTo().window(al2.get(2));
}
}