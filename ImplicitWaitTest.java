package seleniumForDummies;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class ImplicitWaitTest {
	
	private String baseUrl= "https://learn.letskodeit.com/p/practice";
	private WebDriver driver = new ChromeDriver();
	
	@BeforeEach
	public void setUp() throws Exception {
		
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ramirezplascencial\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Test
	void test() {
		
		driver.get(baseUrl);
		WebElement login = driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/div/ul/li[2]/a"));
		
		System.out.println("button found ...");
		login.click();	
		
		driver.findElement(By.id("user_email")).sendKeys("test");
	}

	@AfterEach
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		driver.close();
	}
}
