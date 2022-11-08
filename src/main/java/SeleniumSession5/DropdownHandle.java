package SeleniumSession5;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");

		// By industryDropdown=By.id("Form_submitForm_Industry");
		By countryDropdown = By.id("Form_getForm_Country");

		Select selectCountryDD = new Select(driver.findElement(countryDropdown));
//		//selectCountryDD.selectByIndex(5); the index in dropdowns start from 1 n not 0
//		
//		//selectCountryDD.selectByVisibleText("India");Index can change but visible text
//		//doest thus this method is preferred

		// selectCountryDD.selectByValue("Armenia");
		
		// doSelectByIndex(countryDropdown, 4);
		// doSelectByVisibleText(countryDropdown, "India");
		// doSelectByValue(countryDropdown, "Algeria");

//		List<WebElement> list=selectCountryDD.getOptions();
//		System.out.println("Total Industry Options="+list.size());
//		
//		for(WebElement e:list) {
//			String text=e.getText();
//			System.out.println(text);
//		}
//	
		List<String> countryList = getDropdownOptionsValue(countryDropdown);
		System.out.println(countryList.size());
		System.out.println(countryList);
		if (countryList.contains("India")) {
			System.out.println("Pass");
		}
		driver.close();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectByIndex(By locator, int index) {
		Select dropdown = new Select(getElement(locator));
		dropdown.selectByIndex(index);
	}

	public static void doSelectByValue(By locator, String value) {
		Select dropdown = new Select(getElement(locator));
		dropdown.selectByValue(value);
	}

	public static void doSelectByVisibleText(By locator, String value) {
		Select dropdown = new Select(getElement(locator));
		dropdown.selectByVisibleText(value);
	}

	public static List<String> getDropdownOptionsValue(By locator) {

		List<String> optionsValueList = new ArrayList<String>();

		Select dropdown = new Select(getElement(locator));
		List<WebElement> optionsList = dropdown.getOptions();
		// System.out.println("Total Options="+list.size());

		for (WebElement e : optionsList) {
			String text = e.getText();
			optionsValueList.add(text);
			// System.out.println(text);
		}
		return optionsValueList;
	}
}
