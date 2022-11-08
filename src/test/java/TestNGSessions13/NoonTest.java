
package TestNGSessions13;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NoonTest extends BaseTest{

	@Test(priority = 1)
	public void noonTitleTest() {
		driver.get("https://www.noon.com/");
		String title = driver.getTitle();
		System.out.println("Page Title=" + title);
		Assert.assertEquals(title, "Online Shopping UAE | Fashion, Electronics, Beauty, Baby, Groceries");
	}

	@Test(priority = 2)
	public void noonLogoTest() {
		Assert.assertTrue(driver.findElement(By.xpath("//a[@href='/uae-en/']//img")).isDisplayed());
	}

	@Test(priority = 3)
	public void noonSignInTest() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(driver.findElement(By.id("dd_header_signInOrUp")).isDisplayed());
	}
}
