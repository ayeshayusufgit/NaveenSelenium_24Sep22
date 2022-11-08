package SeleniumSession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println("Page Title"+title);
		//driver.quit();
		driver.close();
		System.out.println("Current Url"+driver.getCurrentUrl());
	}
}
