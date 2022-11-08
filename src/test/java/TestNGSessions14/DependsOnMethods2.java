package TestNGSessions14;

import org.testng.annotations.Test;

public class DependsOnMethods2 {

	@Test(priority=1)
	public void loginTest() {
		System.out.println("Login Test");
		int div=100/0;
	}
	
	@Test(priority=2,dependsOnMethods = "loginTest")
	public void searchTest() {
		System.out.println("Search Test");
	}
	
	@Test(priority=3,dependsOnMethods = "loginTest")
	public void filterTest() {
		System.out.println("Filter Test");
	}
}
