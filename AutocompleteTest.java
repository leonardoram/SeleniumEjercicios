package seleniumForDummies;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

class AutocompleteTest {
	
	private WebDriver driver;
	private String baseUrl;

	@BeforeEach
	void setUp() throws Exception {
		
		driver = new ChromeDriver();
		baseUrl = "https://www.southwest.com/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
		Thread.sleep(3000);
		driver.close();
	}

	@Test
	void AutoCompleteTest() {
		
	}

}


//LandingPageAirSearchForm_originationAirportCode