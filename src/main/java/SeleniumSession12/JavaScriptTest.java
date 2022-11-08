package SeleniumSession12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
				
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		
//		driver.get("https://www.makemytrip.com/");

//		String title=jsUtil.getTitleByJS();
//		System.out.println(title);
		
//		String pageText=jsUtil.getPageInnerText();
//		System.out.println(pageText);
//		
//		if(pageText.contains("Deals & Sales Pipeline")) {
//			System.out.println("Pass");
//		}
		
//		jsUtil.refreshBrowserByJS();
		
//		driver.get("https://classic.crmpro.com/index.html");
		
//		WebElement username = driver.findElement(By.name("username"));
//		WebElement password = driver.findElement(By.name("password"));
//		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		
//		jsUtil.drawBorder(loginButton);
		
//		jsUtil.flash(username);
//		username.sendKeys("batchautomation");
//		jsUtil.flash(password);
//		password.sendKeys("Test@12345");
//		jsUtil.flash(loginButton);
//		loginButton.click();
		
//		jsUtil.getBrowserInfo();
		
		driver.get("https://www.amazon.in/");
//		jsUtil.scrollPageDown();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		jsUtil.scrollPageUp();
		
		WebElement ele=driver.findElement(By.linkText("Interest-Based Ads"));
		jsUtil.scrollIntoView(ele);
		ele.click();
		
		driver.close();

	}

}
