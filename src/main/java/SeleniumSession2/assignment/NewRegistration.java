package SeleniumSession2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import SeleniumSession2.ElementUtil;
import SeleniumSession2.WebDriverFactory;

public class NewRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverFactory wdf=new WebDriverFactory();
		WebDriver driver=wdf.init_browser("chrome");
		wdf.launchUrl("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		
		By fNameTb=By.id("input-firstname");
		By lNameTb=By.id("input-lastname");
		By emailTb=By.id("input-email");
		By passwordTb=By.id("input-password");
		By agreeCb=By.name("agree");
		By submitButton=By.xpath("//button[@type='submit']");
		
		
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendKeys(fNameTb, "Ayesha");
		eleUtil.doSendKeys(lNameTb, "Yusuf");
		eleUtil.doSendKeys(emailTb, "ayesha.yusuf100@gmail.com");
		eleUtil.doSendKeys(passwordTb, "test123");
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		//jse.executeScript("arguments[0].scrollIntoView()", eleUtil.getElement(agreeCb)); 
		jse.executeScript("scroll(0, 250)");
		eleUtil.doClick(agreeCb);
		eleUtil.doClick(submitButton);
		
		//eleUtil.doClick(submit);

		wdf.quitBrowser();

		
	}

}
