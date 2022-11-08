package SeleniumSession4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks2 {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//The language links in a particular section of the page
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		By langLinks=By.xpath("//div[@id='SIvCob']/a");
		
		clickElement(langLinks, "Arabic");
		
		//driver.close();
	}

	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	public static void clickElement(By locator,String value) {
		List<WebElement> elementList = getElements(locator);
		
		for(int i=0;i<elementList.size();i++) {
			WebElement curEle=elementList.get(i);
			String curText=curEle.getText();
			
			if(curText.equals(value)) {
				curEle.click();
				break;
			}
		}
	}
}
