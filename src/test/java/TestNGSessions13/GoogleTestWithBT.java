package TestNGSessions13;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTestWithBT extends BaseTest {

	@Test(priority = 1)
	public void googleTitleTest() {
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("Page Title=" + title);
		Assert.assertEquals(title, "Google");
	}

	@Test(priority = 2)
	public void googleLogoTest() {
		Assert.assertTrue(driver.findElement(By.id("hplogo")).isDisplayed());
	}

	@Test(priority = 3, enabled = true)
	public void googleSearchButtonTest() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).isDisplayed());
	}
}