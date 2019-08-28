package seleniumForDummies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWebDriver {
	
	public static void main(String[] args) {
		
		String baseUrl = "https://google.com";
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramirezplascencial\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
	}

}
