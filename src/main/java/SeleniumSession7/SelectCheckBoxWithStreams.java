package SeleniumSession7;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectCheckBoxWithStreams {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");

		List<WebElement> checkboxList = driver.findElements(By.cssSelector("td.select-checkbox"));
		System.out.println(checkboxList.size());
				
		//checkboxList.stream().forEach(ele->ele.click());
		
		checkboxList.parallelStream().forEach(ele->ele.click());
		driver.close();
	}
}
