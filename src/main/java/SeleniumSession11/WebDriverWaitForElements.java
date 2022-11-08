package SeleniumSession11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumSession2.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForElements {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freshworks.com/");
		
		By footerLinks=By.cssSelector("ul.footer-nav li a");
		
//		WebDriverWait wait=new WebDriverWait(driver,10);
//		List<WebElement> footerLinkList= wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(footerLinks));
		
		ElementUtil elementUtil=new ElementUtil(driver);
//		List<WebElement> footerLinkList=elementUtil.visiblityOfAllElements(footerLinks, 10);
//		
//		footerLinkList.stream().forEach(ele->System.out.println(ele.getText()));
		
		elementUtil.getPageElementText(footerLinks, 10);
		
		driver.close();
	}
}
