package SeleniumSession7;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StreamsWithListAndFilter {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());

//		List<String> collectList = linkList.stream().filter(ele -> !ele.getText().equals(""))
//															.map(ele -> ele.getText())
//																.collect(Collectors.toList());

//		collectList.stream().forEach(ele->System.out.println(ele));

		// print the text of each link contains Amazon keyword

		List<String> collectList = linkList.stream()
											.filter(ele->!ele.getText().isEmpty())
											.filter(ele -> ele.getText().contains("Amazon"))
												.map(ele -> ele.getText())
													.collect(Collectors.toList());
		
		collectList.stream().forEach(ele->System.out.println(ele));
		driver.close();
	}
}
