package SeleniumSession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		driver.close();

	}

}
