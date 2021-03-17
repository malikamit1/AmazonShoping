
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonShoping {
public static void main(String[] args) throws InterruptedException 
{
    System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.youlikehits.com/");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text()='Login']")).click();
    Thread.sleep(3000);
    //driver.findElement(By.id("Username")).sendKeys("Username@gmail.com",Keys.
    driver.findElement(By.id("Username")).sendKeys("Jyotsna Hisaa");
    Thread.sleep(2000);
    driver.findElement(By.id("password")).sendKeys("JophinJacob123$#4942",Keys.ENTER);
    Thread.sleep(4000);
    
     driver.get("https://www.youlikehits.com/youtube2.php");
     Thread.sleep(2000);
     driver.findElement(By.linkText("Subscribe")).click();
     Thread.sleep(2000);
     
     driver.findElement(By.partialLinkText("Subscribe")).click();
     
     String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
     String subWindowHandler = null;
     
     Set<String> handles = driver.getWindowHandles(); // get all window handles
     Iterator<String> iterator = handles.iterator();
     while (iterator.hasNext()){
         subWindowHandler = iterator.next();
     }
     driver.switchTo().window(subWindowHandler);// switch to popup window
     Thread.sleep(2000);
     driver.findElement(By.linkText("SUBSCRIBE")).click();
     Thread.sleep(2000);
    // driver.close();

     // Now you are in the popup window, perform necessary actions here

     driver.switchTo().window(parentWindowHandler);  
     
		/*
		 * Thread.sleep(2000); driver.findElement(By.linkText("Subscribe")).click();
		 * Thread.sleep(2000);
		 */
     
	/*
	 * driver.findElement(By.xpath("//*[text()='Hello. Sign in']")).click();
	 * Thread.sleep(3000);
	 * driver.findElement(By.id("ap_email")).sendKeys("Username@gmail.com",Keys.ENTER); 
	 * Thread.sleep(2000);
	 * driver.findElement(By.id("ap_password")).sendKeys("Password",Keys.ENTER);
	 * Thread.sleep(4000);
	 */
    //driver.close();
}
}