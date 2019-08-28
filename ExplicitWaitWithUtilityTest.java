package seleniumForDummies;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumForDummies.WaitTypes;

class ExplicitWaitWithUtilityTest {

	private String baseUrl= "https://learn.letskodeit.com/p/practice";
	private WebDriver driver = new ChromeDriver();
	WaitTypes wt = new WaitTypes(driver);
	
	@BeforeEach
	public void setUp() throws Exception {
		
		driver.manage().window().maximize();
		
	}

	@Test
	void LoginPageTest() {
		
		driver.get(baseUrl);
		WebElement loginlink = driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/div/ul/li[2]/a"));
		loginlink.click();
		
		WebElement userEmail = wt.waitForElement(By.id("user_email"), 3) ;
		
		userEmail.sendKeys("test");
		
		wt.clickWhenReady(By.name("commit"), 3);
	}

	@AfterEach
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		driver.close();
	}

}
