package seleniumForDummies;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class ExplicitWaitTest {

	private String baseUrl= "https://learn.letskodeit.com/p/practice";
	private WebDriver driver = new ChromeDriver();
	
	@BeforeEach
	public void setUp() throws Exception {
		
		driver.manage().window().maximize();
		
	}

	@Test
	void test() {
		
		driver.get(baseUrl);
		WebElement loginlink = driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/div/ul/li[2]/a"));
		loginlink.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement userEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
		
		userEmail.sendKeys("test");
	}

	@AfterEach
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		driver.close();
	}

}
