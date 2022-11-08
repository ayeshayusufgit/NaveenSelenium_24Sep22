package SeleniumSession11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumSession2.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForClick {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");
		
		By forgotPwd=By.linkText("Forgot Password?111");
		//=>throws TimeoutException and NoSuchElementException
		
		
//		WebDriverWait wait=new WebDriverWait(driver,15);
//		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(forgotPwd));
//		element.click();
		
		ElementUtil elementUtil=new ElementUtil(driver);
		elementUtil.clickWhenReady(forgotPwd, 10);
		
		driver.close();
	}

}
