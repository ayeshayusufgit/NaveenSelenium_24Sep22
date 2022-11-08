package SeleniumSession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("Page Title=" + title);

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
