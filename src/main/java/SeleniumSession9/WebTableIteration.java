package SeleniumSession9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableIteration {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		// to get data from the webtable using xpath
		List<WebElement> tableList_xpath = driver.findElements(By.xpath("//table[@id='customers']//td"));
		System.out.println(tableList_xpath.size());

		// to get data from the webtable using css selector
		List<WebElement> tableList_css = driver.findElements(By.cssSelector("table[id='customers'] td"));
		System.out.println(tableList_css.size());

		// tableList_xpath.stream().forEach(ele->System.out.println(ele.getText()));
		for (WebElement ele : tableList_xpath) {
			System.out.println(ele.getText());
		}
		System.out.println("===========================================");
		
		// table[@id='customers']//td[1] -> 6
		// table[@id='customers']//td[2]
		// table[@id='customers']//td[3]

		for (int i = 1; i <= 3; i++) {
			System.out.println("Column-----------" + i + "------------");
			List<WebElement> columnData = driver
					.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[" + i + "]"));
			columnData.stream().forEach(ele -> System.out.println(ele.getText()));
			System.out.println("========================================");
		}
		driver.close();
	}
}
