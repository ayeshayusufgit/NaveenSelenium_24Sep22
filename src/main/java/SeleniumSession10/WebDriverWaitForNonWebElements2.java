package SeleniumSession10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumSession2.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForNonWebElements2 {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		By signinBtn=By.name("proceed");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		
		String title=eleUtil.waitForTitleToBe("Rediff", 10);
		System.out.println("Page Title="+title);
		
		eleUtil.waitForElementPresent(signinBtn, 10).click();

//		WebDriverWait wait=new WebDriverWait(driver, 10);
//		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(alert.getText());
//		alert.accept();
		
		eleUtil.acceptJSAlert(10);
		
		driver.close();
	}
}
