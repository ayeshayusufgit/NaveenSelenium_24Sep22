package SeleniumSession6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import SeleniumSession2.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");

		// WebElement parentMenuLink = driver.findElement(By.className("menulink"));

		By parentMenu = By.className("menulink");
		By subMenuCourses = By.linkText("COURSES");

//		Actions action = new Actions(driver);	
//		action.moveToElement(parentMenuLink).perform();

		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doMoveToElement(parentMenu);
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.linkText("COURSES")).click();

//		eleUtil.doActionsClick(subMenuCourses);

		eleUtil.clickOnSubMenu(parentMenu, subMenuCourses);
	}
}
