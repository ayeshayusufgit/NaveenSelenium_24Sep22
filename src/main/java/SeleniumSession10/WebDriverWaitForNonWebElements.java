package SeleniumSession10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumSession2.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForNonWebElements {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dollartree.com/");
		
		By quickOrder=By.xpath("//span[text()='Catalog Quick Order']");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.waitForElementPresent(quickOrder, 10).click();
		
		//in this case boolean is returned(waiting for a part of the url)
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		//boolean flag=wait.until(ExpectedConditions.urlContains("catalog-quick-order"));
		//System.out.println(flag);
		
		if(eleUtil.waitForUrlToBe("catalog-quick-order", 10)) {
			System.out.println("Correct URL");
		}
		
		
		

	}

}
