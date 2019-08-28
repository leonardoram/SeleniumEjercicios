package seleniumForDummies;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SwitchWindowsTest {
	
	private WebDriver driver;
	private String url;

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		url = "https://learn.letskodeit.com/p/practice";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterEach
	void tearDown() throws Exception {
		
		Thread.sleep(3000);
		driver.quit();
	}

	
	@Ignore("not ready yet") @Test
	void SwitchWindowsTest() throws Exception {
		driver.get(url);
		// get the handle of the current window 
		
		String parentHandle = driver.getWindowHandle();
		
		WebElement openWindow = driver.findElement(By.id("openwindow"));
		openWindow.click();
		
		//get all the handles 
		Set <String> handles = driver.getWindowHandles();
		
		for(String handle: handles) {
			System.out.println("handle number: "+handle);
			if(!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				
				WebElement searchBox = driver.findElement(By.id("search-courses"));
				searchBox.sendKeys("python");
				
				Thread.sleep(3000);
				driver.close();
				break;
			}
		}
		
		//switching back to the parent handle 
		driver.switchTo().window(parentHandle);
	}
	
	@Test
	void SwitchingIframetest() throws Exception {
		driver.get(url);
		
		driver.switchTo().frame("courses-iframe");
		
		WebElement searchBox = driver.findElement(By.id("search-courses"));
		searchBox.sendKeys("test");
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("bien hecho pto");
		
	}
	

}
