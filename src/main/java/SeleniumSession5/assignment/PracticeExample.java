package SeleniumSession5.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeExample {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		By searchTextBox = By.id("search_query_top");
		driver.findElement(searchTextBox).sendKeys("dress");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		List<WebElement> searchResultOverlay = driver.findElements(By.xpath("//div[@class='ac_results']//li"));
		System.out.println(searchResultOverlay.size());
		for (WebElement e : searchResultOverlay) {
			String text = e.getText();
			if (text.contains("Printed Chiffon Dress")) {
				e.click();
				break;
			}
		}

		driver.quit();

	}
}
