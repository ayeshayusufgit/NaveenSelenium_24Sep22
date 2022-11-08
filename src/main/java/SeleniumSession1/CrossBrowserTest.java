package SeleniumSession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "chrome";

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("Pls enter a valid browsername");
		}
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		String title = driver.getTitle();

		// driver.manage().window().fullscreen();
		driver.manage().window().maximize();

		driver.get("https://www.google.com");

		if (title.equals("Google")) {
			System.out.println("Correct Title");
		} else {
			System.out.println("Incorrect title");
		}

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());

		driver.close();

	}

}
