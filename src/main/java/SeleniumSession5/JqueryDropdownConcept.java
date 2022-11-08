package SeleniumSession5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropdownConcept {
	static WebDriver driver;

	// Jquery is the javascript framework used to design web components
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		driver.findElement(By.id("justAnInputBox")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		By choice = By.xpath("//span[@class='comboTreeItemTitle']");

		// To select more than n option the function will be called n times
		// 1.Single Selection
		// selectChoiceDropdown(choice, "choice 3");
		selectChoiceDropdown(choice, "choice 6 2 3");

		// 2.Multi Selection
		// selectChoiceDropdown(choice, "choice 1", "choice 2", "choice 2 1");

		// 3.All Selection
		// selectChoiceDropdown(choice, "All");
		// selectChoiceDropdown(choice, "ALL");

		driver.close();
	}

	/**
	 * This function handles 3 testcases:
	 * 1.Single Selection
	 * 2.Multiple Selection
	 * 3.All Selection:	Pls pass "all/ALL/All" 
	 * @param locator
	 * @param value
	 */

	public static void selectChoiceDropdown(By locator, String... value) {
		List<WebElement> choiceList = driver.findElements(locator);
		if (!value[0].equalsIgnoreCase("All")) {
			for (WebElement element : choiceList) {
				String text = element.getText();
				System.out.println(text);
				for (int i = 0; i < value.length; i++) {
					if (text.equals(value[i])) {
						element.click();
						break;
					}
				}
			}
		} else {
			try {
				for (WebElement element : choiceList) {
					element.click();
				}
			} catch (Exception e) {

			}
		}
	}
}