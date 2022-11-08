package TestNGSessions14;

import org.testng.annotations.Test;

public class ExpectedExceptions1 {
	
	@Test
	public void divTest() {
		System.out.println("Div Test");
		int div=10/0;
		System.out.println("Finished Div Test");
	}

}
