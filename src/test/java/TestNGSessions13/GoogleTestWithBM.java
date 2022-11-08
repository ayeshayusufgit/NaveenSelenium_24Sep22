package TestNGSessions13;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTestWithBM {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void googleTitleTest() {
		String title=driver.getTitle();
		System.out.println("Page Title="+title);
		Assert.assertEquals(title, "Google");
	}
	
	@Test
	public void googleLogoTest() {
		Assert.assertTrue(driver.findElement(By.id("hplogo")).isDisplayed());
	}

	@Test
	public void googleSearchButtonTest() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).isDisplayed());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}