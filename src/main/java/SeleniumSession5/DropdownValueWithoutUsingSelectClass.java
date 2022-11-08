package SeleniumSession5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownValueWithoutUsingSelectClass {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");

		// By industryDropdown=By.id("Form_submitForm_Industry");
		// By countryDropdown = By.id("Form_getForm_Country");

		// Dont use the select class
		// but there is a select tag
		// and select the value from the dropdown

		// By industryDropdown =
		// By.xpath("//select[@id='Form_submitForm_Industry']/option");
		By countryDropdown = By.xpath("//select[@id='Form_getForm_Country']/option");

//		List<WebElement> countryList = driver.findElements(countryDropdown);
//		System.out.println(countryList.size());
//		for(WebElement e:countryList) {
//			System.out.println(e.getText());
//		}

		// selectDropdownValue(industryDropdown, "Education");
		selectDropDownValue(countryDropdown, "India");
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void selectDropDownValue(By locator, String value) {

		List<WebElement> optionsList = getElements(locator);
		System.out.println(optionsList.size());

		for (WebElement e : optionsList) {
			String text = e.getText();

			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}
}
