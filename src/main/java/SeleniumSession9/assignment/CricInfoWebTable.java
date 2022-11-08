package SeleniumSession9.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfoWebTable {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/series/new-zealand-t20i-tri-series-2022-23-1322281/new-zealand-vs-pakistan-final-1322340/full-scorecard");
		// to get data from the webtable using xpath
		List<WebElement> tableList_xpath1 = driver.findElements(By.xpath("//table[@class='ds-w-full ds-table ds-table-md ds-table-auto  ci-scorecard-table']//tbody//tr/td[2]//span/span"));
		System.out.println(tableList_xpath1.size());

		
		// tableList_xpath.stream().forEach(ele->System.out.println(ele.getText()));
		/*for (WebElement ele : tableList_xpath1) {
			System.out.println(ele.getText());
		}*/
		
		for(int i=1;i<=2;i++) {
			List<WebElement> tableList_xpath2 = driver.findElements(By.xpath("//table[@class='ds-w-full ds-table ds-table-md ds-table-auto  ci-scorecard-table']//tbody//tr/td["+i+"]//span/span"));
			System.out.println(tableList_xpath2.size());
			tableList_xpath2.stream().forEach(ele->System.out.println(ele.getText()));
		}
		driver.close();
	}

}
