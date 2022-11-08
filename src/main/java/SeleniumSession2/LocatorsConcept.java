package SeleniumSession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		driver=new ChromeDriver();
//		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//Method 1
//		driver.findElement(By.id("input-email")).sendKeys("ayesha.yusuf@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Kolkata05");
		
		//Method 2
//		WebElement email=driver.findElement(By.id("input-email"));
//		WebElement password=driver.findElement(By.id("input-password"));
//		
//		email.sendKeys("ayesha.yusuf@gmail.com");
//		password.sendKeys("Kolkata05");
//		
		//Method 3
		By emailId=By.id("input-email");
		By passwordId=By.id("input-password");
//		
//		driver.findElement(emailId).sendKeys("ayesha.yusuf@gmail.com");
//		driver.findElement(passwordId).sendKeys("Kolkata05");
		
		//Method 4
//		getElement(emailId).sendKeys("ayesha.yusuf@gmail.com");
//		getElement(passwordId).sendKeys("Kolkata05");
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		By url=By.id("Form_getForm_subdomain");
		By fname=By.id("Form_getForm_Name");
		By email=By.id("Form_getForm_Email");
		By phoneNumber=By.id("Form_getForm_Contact");
		By submit=By.id("Form_getForm_action_submitForm");
		
		//getElement(url).sendKeys("test");
		//getElement(fname).sendKeys("Ayesha");
		//getElement(email).sendKeys("ayesha.yusuf@gmail.com");
		//getElement(submit).click();
		
		doSendKeys(url, "test");
		doSendKeys(fname, "Ayesha");
		doSendKeys(email, "ayesha.yusuf@gmail.com");
		doSendKeys(phoneNumber, "9741077488");
		doClick(submit);
		
		driver.close();
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
}
