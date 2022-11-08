package SeleniumSession8;

import org.openqa.selenium.By;

public class Custom_Xpath_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//input[@id='username']
		//input[@id='username' and @type='email']
		//input[@id and @type]
		//input
		//a
		//input[contains(@id,'username')]
		//input[contains(@id,'test_')]
		//input[contains(@id,'-origin-airport')]
		//input[contains(@id,'user') and type='email']
		//input[contains(@id,'user') and contains(@type,'email')]
		
		//https://classic.crmpro.com/index.html
		//h3[contains(text(),'Companies & Contacts')]
		
		//using only text()
		//h3[text()='Contract']
		//input[starts-with(@name,'User')]
		//a[text()='Pricing']
		
		//parent to child -> https://classic.crmpro.com/index.html
		//ul[@class='nav navbar-nav navbar-right']/li/a (both are the same)
		//	or
		//ul[@class='list-unstyled']//child::li
		//	or
		//	(//ul[@class='list-unstyled']//child::li//child::a
		
		//https://www.freshworks.com/->//ul[@class='footer-nav']//a
		
		By ele=By.xpath("//ul[@class='nav navbar-nav navbar-right']/li/a");//right
		By ele1=By.className("nav navbar-nav navbar-right");//wrong
		
		//https://app.hubspot.com/login->	//input[@class='form-control private-form__control login-email']
		By ele2=By.className("login-email");	//unique class name
		
		//indexing in xpath:
		//https://app.hubspot.com/login	->	(//div[@class='private-form__input-wrapper'])[1]	-> capture group
		By .xpath("(//div[@class='private-form__input-wrapper'])[1]");
		
		//https://classic.crmpro.com/index.html	->	(//ul[@class='list-unstyled']/li/a)[4]
		//https://classic.crmpro.com/index.html	->	(//ul[@class='list-unstyled']/li/a)[position()=4]
		//https://classic.crmpro.com/index.html	->	(//h3)[8]
		
		//child to parent
		//backward traversing in xpath using /..
		//https://www.freshworks.com/	-> //a[text()='Company']/../../../../../../../..
		//https://www.freshworks.com/	-> //input[@id='username']//parent::div or //input[@id='username']/parent::div same
		//https://app.hubspot.com/login ->	//input[@id='username']//parent::div//parent::*
		
		//input[@id='username']//ancestor::form
		
	}
	

}
