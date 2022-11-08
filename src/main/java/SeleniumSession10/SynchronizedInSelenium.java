package SeleniumSession10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSession2.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SynchronizedInSelenium {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Sets the amount of time to wait for a page load to complete before throwing 
		//an error.If the timeout is negative, page loads can be indefinite.(pageLoadTimeout)
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		By emailTb=By.id("email");
		By passwordTb=By.id("pass");
		By loginBtn=By.name("login");
		
		
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendKeys(emailTb, "ayesha.yusuf@gmail.com");
		eleUtil.doSendKeys(passwordTb, "Test123");
		eleUtil.doClick(loginBtn);
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		By forgottenPasswordLink=By.linkText("Forgotten password?");
		retryingFindClick(forgottenPasswordLink);
		
		driver.close();
	}
	
	
	public static boolean retryingFindClick(By by) {
	    boolean result = false;
	    int attempts = 0;
	    while(attempts < 2) {
	        try {
	            driver.findElement(by).click();
	            result = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts++;
	    }
	    return result;
	}
	
}
