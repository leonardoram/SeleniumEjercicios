package seleniumForDummies;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class KeyboardKeysTest {
	
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
		
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	void UseKeysClassTest() throws InterruptedException {
		
		driver.get(url);
		
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("user_email")).sendKeys("test@email.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("user_password")).sendKeys("123456");
		Thread.sleep(2500);
		
		driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);
		
	}
	
	@Test
	void SendKeyCombinationTest() {
		
	}

}
