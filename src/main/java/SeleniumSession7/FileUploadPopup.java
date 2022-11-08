package SeleniumSession7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html")
		;
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\ayesh\\OneDrive\\Desktop\\flowers.jpg");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
	}
}
