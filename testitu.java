package seleniumForDummies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testitu {

	public static void main(String[] args) throws Exception {
		
		String baseUrl= "https://learn.letskodeit.com/p/practice";
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get(baseUrl);
		WebElement login = driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/div/ul/li[2]/a"));
		
		System.out.println("button found ...");
		login.click();	
		
		driver.findElement(By.id("user_email")).sendKeys("test");

		Thread.sleep(4000);
		driver.close();
	}

}
