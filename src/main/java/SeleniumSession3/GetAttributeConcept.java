package SeleniumSession3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeConcept {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
//		String fullname=driver.findElement(By.id("Form_getForm_Name")).getAttribute("name");
//		System.out.println("Full Name="+fullname);
//		
//		String privacyPolicyUrl=driver.findElement(By.linkText("Privacy Policy")).getAttribute("href");
//		System.out.println(privacyPolicyUrl);
		
		
		By fullname=By.id("Form_getForm_Name");
		By privacyPolicyUrl=By.linkText("Privacy Policy");
		
		String nameAttr=doGetAttribute(fullname, "name");
		String privacy_url=doGetAttribute(privacyPolicyUrl, "href");
		
		System.out.println(nameAttr);
		System.out.println(privacy_url);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	//wrapper on getAttribute()
	public static String doGetAttribute(By locator,String attribute) {
		return getElement(locator).getAttribute(attribute);
	}
	
}
