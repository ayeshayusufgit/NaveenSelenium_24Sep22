package SeleniumSession10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
	static WebDriver driver;

	// WebDriverWait(C)->(extending)FluentWait(C)->Wait(I)
	// Wait->Functional Interface->Follows the sam pattern(single abstract method)
	//Explicit Wait
	//Can be applied on a specific element(not a global wait)
	//Can be applied to non webelements(url,title,alerts)
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");

		By username = By.name("username");
		By password = By.name("password");
		By loginButton = By.xpath("//input[@value='Login']");

		/*
		 * presenceOfElement-a check is made to check the presence of the element in the
		 * DOM of the page This doesnt not necessarily mean that the element in loaded
		 * in the page
		 */

//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement usernameEle = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//		usernameEle.sendKeys("batchautomation");
//		waitForElementPresent(username, 10);

		waitForElementPresent(username, 10).sendKeys("batchautomation");
		driver.findElement(password).sendKeys("ayesha");
		driver.findElement(loginButton).click();
		driver.close();

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	/*
	 * presenceElement=>An expectation for checking if the element is present or not
	 * in the html dom This doesnt not necessary mean that the element is visible
	 */

	public static WebElement waitForElementPresent(By locator, int timeOut) {
		//element present in the dom
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/*
	 * waitForElementVisible=>An expectation for checking that an element, known to
	 * be present on the DOM of a page, isvisible. Visibility means that the element
	 * is not only displayed but also has a height andwidth that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */

	public static WebElement waitForElementVisible(By locator, int timeOut) {
		//element visible on the webpage
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
	}
}