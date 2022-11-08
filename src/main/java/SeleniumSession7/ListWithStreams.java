package SeleniumSession7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListWithStreams {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());

		long sTime = System.currentTimeMillis();
		// Sequential Stream-order is maintained,slower
		linkList.stream().forEach(ele -> System.out.println(ele.getText()));
		System.out.println("==================================================");
		
		// Parallel Stream-order is not maintained,faster
		linkList.parallelStream().forEach(ele -> System.out.println(ele.getText()));
		long eTime = System.currentTimeMillis();
		System.out.println("Time Taken Parallel Streams=" + (eTime - sTime));
		driver.quit();
	}
}
