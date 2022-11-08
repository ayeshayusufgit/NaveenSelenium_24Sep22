package TestNGSessions14;

import org.testng.annotations.Test;
	
public class ExpectedExceptions3 {
	String name="Ayesha";
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void divTest() {
		System.out.println("Null Pointer Test");
		ExpectedExceptions3 obj=new ExpectedExceptions3();
		obj=null;
		System.out.println(obj.name);
		System.out.println("Finished Null Pointer Test");
	}
}
