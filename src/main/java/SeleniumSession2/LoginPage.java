package SeleniumSession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverFactory wdf=new WebDriverFactory();
		WebDriver driver=wdf.init_browser("chrome");
		wdf.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial");
		String title=wdf.getPageTitle();
		System.out.println("Page Title="+title);
		String pageUrl=wdf.getPageUrl();
		System.out.println("Page URL="+pageUrl);
		By url=By.id("Form_getForm_subdomain");
		By fname=By.id("Form_getForm_Name");
		By email=By.id("Form_getForm_Email");
		By phoneNumber=By.id("Form_getForm_Contact");
		By submit=By.id("Form_getForm_action_submitForm");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendKeys(url, "test");
		eleUtil.doSendKeys(fname, "ayesha");
		//eleUtil.doClick(submit);

		wdf.quitBrowser();
	}

}
