package SeleniumSession9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCssSelectors {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/");
		
		//https://app.hubspot.com/login
		//css selector: its a locator not an attribute
		//id->#id or id with tag->tag#id
		//class->.class or class with tag->tag.class 
		//.c1.c2.c3....cn
		
		//#id	=>	#username
		
		//tag#id	=>	input#username
		
		//class		=>	.login-email
		
		//tag.class		=>	input.login-email
		
		//.c1.c2.c3....cn	=>	.form-control.private-form__control.login-email
		
		//#id.class		=>		#username.login-email
		//	or
		//.class#id		=>		.login-email#username
		
		//#id.class1.class2....classn	=>	#username.form-control.private-form__control.login-email
		//	or
		//.class1.class2....classn#id	=>	.form-control.private-form__control.login-email#username
		
		//tag.class#id		=>		input.login-email#username
		
		By e1=By.cssSelector(".form-control.private-form__control.login-email");
		By e2=By.xpath("//input[@class='form-control private-form__control login-email']");
		//By e3=By.className(".form-control.private-form__control.login-email"); -> wont work
		
		//tag[attributeName='value']	=>		//input[@class='form-control private-form__control login-email']
		
		By e3=By.className("input[name=username]");
		
		//tag[attributeName1='value1'][attributeNameN='valueN']		=>		
		//input[name='username'][type='text']
		//input[name='username'][type='text'][placeholder='Username']
		
		//==============================================================
		//xpath=>	//input[@name='username']
		//css=>		input[name='username']
		
		//xpath=>	//input[@name='username' and @type='text' and @placeholder='Username']
		//css=>		input[name='username'][type='text'][placeholder='Username']
		
		//==============================================================
		//parent to child	=>	div.private-form__input-wrapper input#username
		//					=>	div.private-form__input-wrapper>input#username
		//					=>  div.private-form__input-wrapper > input#username
		
		
		//	https://www.freshworks.com/
		//	ul.nav-main-menu li span =>	ul.l-nav-list.nav-main-menu li a
		
		//https://classic.crmpro.com/index.html
		By footerLinks=By.cssSelector("//input[@name='username' and @type='text' and @placeholder='Username']");
		
		//https://classic.crmpro.com/index.html	=>	ul.navbar-right a
		
		//================================================================
		
		//CSS does not support child to parent navigation
		//since webtables require the navigation from child to parent it cant be accessed using css selector but can be using xpaths
		
		//CSS	=>	contains(*)	=>	input[id*='username']
		//https://www.kayak.co.in/?ispredir=true	=>		input[id*='-origin-airport']
		
		// Css	=>	starts-with(^)
		//https://app.hubspot.com/		=>		input[id^='user']
		
		
		//Css	=>	ends-with($)	=>		input[id$='name']
		//https://app.hubspot.com/
		
		//comma in Css, to select different types of elements
		//https://app.hubspot.com/	=>	input#username,button#loginBtn
		//selecting multiple elements(tags) having different tags is not possible in xpaths
		//	elements	=>	input#username,input#password,button#loginBtn,path.UICheckbox__PrivateCheckboxIconInner-ompipw-2.private-checkbox__icon__inner
		
		By loginFormLocators=By.cssSelector("input#username,input#password,button#loginBtn,path.UICheckbox__PrivateCheckboxIconInner-ompipw-2.private-checkbox__icon__inner");
		int loginFormElementsCount=driver.findElements(loginFormLocators).size();
		
		if(loginFormElementsCount==4) {
			System.out.println("My login page is displayed with all mandatory fields...");
		}
		
		//preceding-sibling is not there in css as navigation can be done only in the forward direction
		//so only following-sibling is there
		//	https://classic.crmpro.com/index.html	=>	following-sibling	=>	input[name='username']+input
		
		//not operator in css:
		//https://app.hubspot.com/			input.form-control.private-form__control:not(#username)
		//(not there in xpath)
		
		
		
		//	accessing the index in css: nth-of-type(n)
		//	https://www.freshworks.com/	=>	
		//	ul.footer-nav li:nth-of-type(1) a	=> specific index
		//	ul.footer-nav li:nth-of-type(n) a	=> all the index
		
		//	https://classic.crmpro.com/index.html
		//	ul.list-unstyled li:nth-of-type(n) a	=> all the indexes matching
		
		//	css selector for only the first coloumn of the webtable in w3schools
		//	https://www.w3schools.com/html/html_tables.asp
		//	css	=>		table[id='customers'] td:nth-of-type(1)
		//	xpath =>	//table[@id='customers']//td[1]
		
		
		
	}

}
