package SeleniumSession4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//The language links in a particular section of the page
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		List<WebElement> languageList = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(languageList.size());
		
		for(int i=0;i<languageList.size();i++) {
			WebElement curEle=languageList.get(i);
			String language=curEle.getText();
			System.out.println(language);
			if(language.equals("मराठी	")) {
				curEle.click();
				break;
			}
		}
		//driver.close();
	}

}
