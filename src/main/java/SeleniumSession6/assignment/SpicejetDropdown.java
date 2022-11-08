package SeleniumSession6.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import SeleniumSession2.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SpicejetDropdown {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		By addOnsLink = By.linkText("ADD-ONS");
		By travelInsurance = By.linkText("Travel Insurance");
		By subMenustudentDis = By.linkText("Student Discount");

		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.clickOnSubMenu(addOnsLink, travelInsurance);
		eleUtil.clickOnSubMenu(addOnsLink, subMenustudentDis);
		
		
		driver.close();
	}
}
