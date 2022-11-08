package SeleniumSession4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Total number of links on the page
		
		// you have to print the text of each link with their index number and ignore
		// the blank text
		
		// you have to print the href value(url) of each link
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> list = driver.findElements(By.tagName("a"));
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
