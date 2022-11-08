package SeleniumSession5.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAutosuggestions {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		By searchTextBox = By.id("twotabsearchtextbox");
		driver.findElement(searchTextBox).sendKeys("apple");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		By autosuggestions=By.xpath("//div[@class='autocomplete-results-container']//div[@class='s-suggestion s-suggestion-ellipsis-direction']");
		List<WebElement> autosuggestionsEle=driver.findElements(autosuggestions);
		System.out.println(autosuggestionsEle.size());
		
		for(WebElement element:autosuggestionsEle) {
			String text=element.getText().trim();
			System.out.println(text);
			
			if(text.equals("apple airpods pro")) {
				element.click();
				break;
			}
		}
		driver.close();
	}
}
