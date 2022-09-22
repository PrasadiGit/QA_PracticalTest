
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAnAccount_TestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Chrome web driver adding
		System.setProperty("webdriver.chrome.driver", "/Users/appleuser/eclipse-workspace/TASK_1/TestCase_1/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		Thread.sleep(2000);
		
		// a)	Verify user can create an account
		
    WebElement signIn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		
		
		Thread.sleep(2000);
		
		signIn.click();
		
	}
	

}
