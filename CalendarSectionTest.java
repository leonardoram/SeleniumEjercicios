package seleniumForDummies;

import java.util.List;

//import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class CalendarSectionTest {
	
	private WebDriver driver;
	private String baseUrl;
	

	@BeforeEach
	void setUp() throws Exception {
		
		driver = new ChromeDriver();
		baseUrl = "http://www.expedia.com/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	void SelectDateTest() {
		driver.get(baseUrl);
		//click flights tab
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		//find departing field 
		WebElement departingField = driver.findElement(By.id("flight-departing-hp-flight"));
		//click departing field 
		departingField.click();
		
		WebElement dateToSelect = driver.findElement(
				By.xpath("//*[@id=\"flight-departing-wrapper-hp-flight\"]/div/div/div[3]/table/tbody/tr[5]/td[4]"));
		
		dateToSelect.click();
	}
	
	
	@Test
	void SelectDate2Test() {
		driver.get(baseUrl);
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		
		WebElement departingField = driver.findElement(By.id("flight-departing-hp-flight"));
		departingField.click();
		WebElement calMonth = driver.findElement(
				By.xpath("//*[@id=\"flight-departing-wrapper-hp-flight\"]/div/div/div[2]/table/tbody/tr[6]/td/button"));
		
		List<WebElement> allValidates = calMonth.findElements(By.tagName("a"));
		
		for(WebElement date: allValidates) {
			if(date.getText().equals("30")) {
				date.click();
				break;
			}
		}
		
	}
	
	

}
