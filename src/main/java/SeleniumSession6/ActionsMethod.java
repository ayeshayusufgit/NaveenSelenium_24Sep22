package SeleniumSession6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsMethod {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();

		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginButton = By.xpath("//input[@value='Login']");
		By forgotPwdLink = By.linkText("Forgotten Password");

//		Actions action=new Actions(driver);
//		
//		action.sendKeys(driver.findElement(email),"ayesha.yusuf@gmail.com").perform();
//		action.sendKeys(driver.findElement(password),"Kolkata05").perform();
//		
//		action.click(driver.findElement(loginButton)).perform();
//		action.click(driver.findElement(forgotPwdLink)).perform();

		doActionsSendkeys(email, "ayesha.yusuf@gmail.com");
		doActionsSendkeys(password, "Kolkata05");
		doActionsClick(loginButton);
		doActionsClick(forgotPwdLink);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doActionsSendkeys(By locator, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator), value);
	}

	public static void doActionsClick(By locator) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator));
	}
}
