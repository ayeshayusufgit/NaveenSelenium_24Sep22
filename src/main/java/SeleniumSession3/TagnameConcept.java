package SeleniumSession3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSession2.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TagnameConcept {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WebDriverFactory wdf=new WebDriverFactory();
//		WebDriver driver=wdf.init_browser("chrome");
//		wdf.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");

		// String h1Tag=driver.findElement(By.tagName("h1")).getText();
		// System.out.println("h1 text"+h1Tag);

		// To capture the 2nd h1 text using xpath
		// now no longer there
		// String
		// h1_second=driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/h1[2]")).getText();
		// System.out.println(h1_second);

		// String header1=driver.findElement(By.tagName("h2")).getText();//there are
		// many h2 tags but selenium picks the first one
		// System.out.println(header1);

		// String cus_text=driver.findElement(By.linkText("Customers")).getText();
		// System.out.println(cus_text);

		By h1 = By.tagName("h1");
		//By h1_second = By.xpath("/html/body/section[1]/div/div/div[1]/h1[2]");
		By cust_text=By.linkText("Customers");
		
		System.out.println(doGetText(h1));
		//System.out.println(doGetText(h1_second));
		System.out.println(doGetText(cust_text));
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	// wrapper on getText()
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}

}
