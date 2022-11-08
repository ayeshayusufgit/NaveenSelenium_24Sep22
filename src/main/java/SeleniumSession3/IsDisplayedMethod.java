package SeleniumSession3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayedMethod {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		
		By trialName=By.id("Form_getForm_subdomain");
		By fullname=By.id("Form_getForm_Name");
		By phone=By.id("Form_getForm_Contact");
		By email=By.id("Form_getForm_Email");
		By submitButton=By.id("Form_getForm_action_submitForm");
		
//		System.out.println(driver.findElement(trialName).isDisplayed());
//		System.out.println(driver.findElement(fullname).isDisplayed());
//		System.out.println(driver.findElement(phone).isDisplayed());
//		System.out.println(driver.findElement(email).isDisplayed());
//		System.out.println(driver.findElement(submitButton).isDisplayed());
	
		System.out.println(doIsDisplayed(trialName));
		System.out.println(doIsDisplayed(fullname));
		System.out.println(doIsDisplayed(phone));
		System.out.println(doIsDisplayed(email));
		System.out.println(doIsDisplayed(submitButton));
		
		
		if(doIsDisplayed(trialName)) {
			System.out.println("Trial Name field is displayed");
		}else {
			System.out.println("Trial Name field is not displayed");
		}
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

}
