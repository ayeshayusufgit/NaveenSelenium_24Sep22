package SeleniumSession4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyElement {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();
		
//		List<WebElement> eleList = driver.findElements(By.linkText("Forgotten Password"));
//		System.out.println(eleList.size());
//
//		if (eleList.size() > 0) {
//			System.out.println("Element is present and displayed");
//		} else {
//			System.out.println("Element is not present");
//		}
		
		By forgotPasswordLink=By.linkText("Forgotten Password");
		By continueButton=By.xpath("//a[text()='Continue']");
		
		System.out.println(checkElementPresent(forgotPasswordLink));
		System.out.println(checkElementPresent(continueButton));
		driver.close();
		
	}

	public static boolean checkElementPresent(By locator) {
		List<WebElement> eleList = driver.findElements(locator);
		if (eleList.size() > 0) {
			return true;
		}
		return false;
	}
}
