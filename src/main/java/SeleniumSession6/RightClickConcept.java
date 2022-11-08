package SeleniumSession6;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightClickMeElement = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement quitElement = driver.findElement(By.xpath("//span[text()='Quit']"));

		Actions action = new Actions(driver);
		action.moveToElement(rightClickMeElement).contextClick().build().perform();

		List<WebElement> optionsList = driver
				.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
		System.out.println(optionsList.size());

		for (WebElement element : optionsList) {
			String text = element.getText();
			System.out.println(text);
			if (text.equals("Copy")) {
				element.click();
				break;
			}
		}

		Alert alert=driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		
		System.out.println(alertText);
		driver.close();
	}

}
