package TestNGSessions14;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 100)
	public void loginTest() {
		System.out.println("Login Test");
	}
}
