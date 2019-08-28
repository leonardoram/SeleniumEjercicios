package seleniumForDummies;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class HandlingPopupsTest {
	
	private WebDriver driver;
	private String url;
	

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		url = "";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	void test() {
		
		Alert alertitu = driver.switchTo().alert();
		
	
		
	}

}
