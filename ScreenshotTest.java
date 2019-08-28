package seleniumForDummies;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


class ScreenshotTest {
	
	private WebDriver driver;
	private String Url;
	

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		Url = "https://www.expedia.com/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterEach
	void tearDown() throws Exception {
		String filename = getRandomString(10)+".png";
		String directory = "C:\\Users\\ramirezplascencial\\Documents\\eclipse_screenshots";
		
		TakesScreenshot sourcefile =((TakesScreenshot)driver);
		File shoot = sourcefile.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile( shoot, new File(directory + filename));
		
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	void TakeScreenShotTest() {
		driver.get(Url);
		
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		
		//find elements
		WebElement flight_origin = driver.findElement(By.id("flight-origin-hp-flight"));
		WebElement flight_destination = driver.findElement(By.id("flight-destination-hp-flight"));
		WebElement departure_date = driver.findElement(By.id("flight-departing-hp-flight"));
		WebElement return_date = driver.findElement(By.id("flight-returning-hp-flight"));
		WebElement search = driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-hp-flight\"]/div[7]/label/button"));
		
		//send data to elements 
		flight_origin.sendKeys("New York");
		System.out.println("1111111");
		departure_date.sendKeys("09/10/19");
		System.out.println("22222222");
		return_date.clear();
		return_date.sendKeys("09/18/19");
		System.out.println("33333333");
		search.click();
		
	}
	
	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		
		for(int i =0; i < length; i++) {
			int index = (int) (Math.random() * characters.length());
			sb.append(characters.charAt(index));
		}
		
		return sb.toString();
	}

}
