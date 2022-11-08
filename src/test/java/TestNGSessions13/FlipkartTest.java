package TestNGSessions13;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class FlipkartTest extends BaseTest{

	@Test(priority = 1)
	public void flipkartTitleTest() {
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		System.out.println("Page Title=" + title);
		Assert.assertEquals(title,
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}

	@Test(priority = 2)
	public void flipkartLogoTest() {
		Assert.assertTrue(driver.findElement(By.className("_2xm1JU")).isDisplayed());
	}

	@Test(priority = 3)
	public void flipkartSearchButtonTest() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(driver.findElement(By.className("L0Z3Pu")).isDisplayed());
	}
}
