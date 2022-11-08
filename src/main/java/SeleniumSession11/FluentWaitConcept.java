package SeleniumSession11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
	static WebDriver driver;

	// Two types of wait
	// static wait:Thread.sleep
	// dynamic wait:Implicit wait and Explicit wait->a)WebDriverWait b)FluentWait
	// both implements the Wait Interface

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");

		By forgotPassword = By.linkText("Forgot Password?");

//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
//				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class)
//				.ignoring(StaleElementReferenceException.class);
//		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(forgotPassword));
//		ele.click();
		waitForPresenceOfElementWithFluentWait(forgotPassword, 10, 2).click();
		driver.close();
	}

	public static WebElement waitForPresenceOfElementWithFluentWait(By locator, int timeOut, int pollingTime) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(timeOut))
								.pollingEvery(Duration.ofSeconds(pollingTime))
								.ignoring(NoSuchElementException.class)
								.ignoring(StaleElementReferenceException.class);
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
}
