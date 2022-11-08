package SeleniumSession2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String args[]) {
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println("Title="+title);
	}
}
