package SeleniumSession4.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreshWorksFooterLinks {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freshworks.com/");
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='footer-nav copyrights-nav hide-in-mobile']//a"));
		
		System.out.println("Total links=" + list.size());
		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
			String url = list.get(i).getAttribute("href");
			if (!text.isEmpty()) {
				System.out.println(i + "->" + text);
				//Only print url when text is not zero 
				System.out.println(url);
			}	
		}
		driver.close();

	}

}
