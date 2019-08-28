package seleniumForDummies;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import javax.xml.soap.Text;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class JavascriptExecutionTest {
	
	private WebDriver driver;
	private String URL;
	private JavascriptExecutor js;

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		URL = "https://learn.letskodeit.com/p/practice";
		js = (JavascriptExecutor) driver;
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	void JavascriptExecutionTest() throws Exception {
		driver.get(URL);
		
		js.executeScript("window.location = 'https://learn.letskodeit.com/p/practice';");
		
//		WebElement testBox = (WebElement) js.executeScript("return document.getElementById('name');");
//		testBox.sendKeys("testitu");
		
		//size of window
		
		long heigth = (long) js.executeScript("return window.innerHeight;");
		long width = (long) js.executeScript("return window.innerWidth;");
		
		//scroll down and scroll up 
		
		
		System.out.println("height of the window: "+heigth+" and width: "+width);
		
	}

}
