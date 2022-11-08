package SeleniumSession3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SeleniumSession2.ElementUtil;
import SeleniumSession2.WebDriverFactory;

public class LocatorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverFactory wdf=new WebDriverFactory();
		WebDriver driver=wdf.init_browser("chrome");
		//wdf.launchUrl("https://classic.crmpro.com/index.html");
		//wdf.launchUrl("https://app.hubspot.com/login");
		wdf.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//2.name : https://classic.crmpro.com/index.html
		//By usernameTb=By.name("username");
		//By passwordTb=By.name("password");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		//eleUtil.doSendKeys(usernameTb, "Ayesha");
		//eleUtil.doSendKeys(passwordTb, "test123");
		
		//3.className:https://app.hubspot.com/login
		//class="form-control private-form__control login-email" 3 classes are used for the username
		//class="form-control private-form__control login-password m-bottom-3" 4 classes are used for the password
		
		//driver.findElement(By.className("login-email")).sendKeys("abc");
		//driver.findElement(By.className("login-password")).sendKeys("abc");
		
		//4.xpath:https://www.orangehrm.com/orangehrm-30-day-trial
		//driver.findElement(By.xpath("//*[@id=\"Form_getForm_Name\"]")).sendKeys("Naveen");
		//driver.findElement(By.xpath("//*[@id=\"Form_getForm_Email\"]")).sendKeys("asa@gmail.com");
//		By firstnameTb=By.xpath("//*[@id=\"Form_getForm_Name\"]");
//		By emailTb=By.xpath("//*[@id=\"Form_getForm_Email\"]");
//		eleUtil.doSendKeys(firstnameTb, "abc");
//		eleUtil.doSendKeys(emailTb, "abc");
		
		//5.CSS Selector:https://www.orangehrm.com/orangehrm-30-day-trial
		//driver.findElement(By.cssSelector("#Form_getForm_Name")).sendKeys("Testing");
		//driver.findElement(By.cssSelector("#Form_getForm_Email")).sendKeys("ayesha@gmail.com");
		
//		By nameTb=By.cssSelector("#Form_getForm_Name");
//		By emailTb=By.cssSelector("#Form_getForm_Email");
//		
//		eleUtil.doSendKeys(nameTb, "Testing");
//		eleUtil.doSendKeys(emailTb, "ayesha@gmail.com");
		
		//6.linkText:https://www.orangehrm.com/orangehrm-30-day-trial
		//driver.findElement(By.linkText("Privacy Policy")).click();
		
		//By privacyPolicy=By.linkText("Privacy Policy");
		//eleUtil.doClick(privacyPolicy);
		By contactSalesLink=By.linkText("Contact Sales");
		eleUtil.doClick(contactSalesLink);
		
		//7.partial linktext
		//driver.findElement(By.linkText("Privacy")).click();
		
		//By privacyPolicy=By.linkText("Privacy");
		//eleUtil.doClick(privacyPolicy);

		//Privacy Policy
		//Privacy Details
		
		
		
		
		
		
		//wdf.quitBrowser();

	}

}
