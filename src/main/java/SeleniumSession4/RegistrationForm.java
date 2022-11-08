package SeleniumSession4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationForm {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		
		List<WebElement> textFieldlist=driver.findElements(By.className("form-control"));
		System.out.println(textFieldlist.size());
		
		for(int i=0;i<textFieldlist.size();i++) {
			textFieldlist.get(i).sendKeys("Ayesha");
		}
		
		//driver.close();

	}

}
