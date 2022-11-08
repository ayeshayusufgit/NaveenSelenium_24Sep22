package SeleniumSession7.assignment;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectOptionsUsingStreams {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		List<WebElement> dropdownOptionsList=driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
		/*List<WebElement> listLink=dropdownOptionsList.stream()
											.filter(ele->!(ele.getText().equalsIgnoreCase(a("Country")))
													.map(ele->ele.getText())
													.collect(Collectors.toList());
		*/
		
		List<String> collectList = dropdownOptionsList.stream()
				.filter(ele->!ele.getText().contains("Country"))
					.map(ele -> ele.getText())
						.collect(Collectors.toList());

		collectList.stream().forEach(ele->System.out.println(ele));
		
		driver.close();
											
	}

}
