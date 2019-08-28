package seleniumForDummies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {
	
	WebDriver driver;
	
	public WaitTypes (WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public WebElement waitForElement(By Locator, int timeout) {
		
		WebElement element = null;
		try {
			System.out.println("waiting for maximum of "+ timeout+ " seconds for element to be available ");
			
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
			
			System.out.println("element found in webpage");
			
		}
		catch(Exception e) {
			System.out.println("element not found in webpage");
		}
		return element;
		
	}
	
	public void clickWhenReady (By Locator, int timeout) {
		
		try {
			System.out.println("waiting for maximum of "+ timeout+ " seconds for element to be available ");
			
			WebElement element = null;
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			element = wait.until(ExpectedConditions.elementToBeClickable(Locator));
			element.click();
			
			System.out.println("element clicked on the webpage");
			
		}
		catch(Exception e) {
			System.out.println("element not found in webpage");
		}
		
	}
	
	

}
