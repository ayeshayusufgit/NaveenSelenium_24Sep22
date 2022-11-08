package SeleniumSession6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		
		WebElement sourceElement=driver.findElement(By.id("draggable"));
		WebElement targetElement=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
//		action
//			.clickAndHold(sourceElement)
//				.moveToElement(targetElement)
//					.release()
//						.build()
//							.perform();
//		
		action.dragAndDrop(sourceElement, targetElement).perform();
		
		driver.close();
	}
}
