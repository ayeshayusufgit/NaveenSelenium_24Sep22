package SeleniumSession5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchDropdownOptions {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		By searchTextBox = By.name("q");
		driver.findElement(searchTextBox).sendKeys("Naveen Automation Labs");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// List<WebElement>searchOptions=driver.findElements(By.xpath("//ul[@role='listbox']/li/span"));
		List<WebElement> suggestionsList = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		System.out.println(suggestionsList.size());
		for (WebElement e : suggestionsList) {
			String text=e.getText();
			if(!text.isEmpty()&&text.equals("naveen automation labs git")) {
				//System.out.println(e.getText());
				e.click();
				break;
			}
		}
		driver.close();
	}

}
