package TestNGSessions13;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("create DB connection");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("create a test user");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Launch the URL");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Log into the App");
	}
	
	@Test
	public void amazonTestTitle() {
	System.out.println("Amazon Title Test");	
	}
	
	@Test
	public void amazonTestSearch() {
		System.out.println("Amazon Search Test");
	}
	
	
	@Test
	public void amazonTestFilter() {
		System.out.println("Amazon Filter Test");
	}
	

	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Log out the App");
	}
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("Close the browser");
	}
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("Delete the test user");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("DC with the DB");
	}
	

}
