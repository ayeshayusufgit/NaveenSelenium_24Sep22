package SeleniumSession10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.freecrm.com/index.html");
		
		//global wait -- by default it will be applicable for all the WE and WEs
		//whenever using FE an FEs implicitly wait will be applied
		//not applicable for non WEs like alerts,titles,url
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("batchautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//home page:
		//override the implicitly wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//e4
		//e5
		
		//nullify the implictly wait-these elements require implicitly wait
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		//e6
		//e7
		//e8 e9 e10
		
		//login page-these elements the implicitly wait needs to be changed to 15 secs
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

}
