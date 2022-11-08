package SeleniumSession4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSession2.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoShopLinks {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		
		By shopLinks=By.xpath("//div[@class='list-group mb-3']/a");
		ElementUtil eleUtil=new ElementUtil(driver);
		//eleUtil.clickElement(shopLinks, "Order History");
		
		eleUtil.clickElement(shopLinks, "Returns");
	}
}
