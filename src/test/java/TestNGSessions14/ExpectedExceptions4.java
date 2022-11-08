package TestNGSessions14;

import org.testng.annotations.Test;
	
public class ExpectedExceptions4 {
	String name="Ayesha";
	
	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void divTest() {
		System.out.println("Null Pointer Test");
		ExpectedExceptions4 obj=new ExpectedExceptions4();
		obj=null;
		System.out.println(obj.name);
		System.out.println("Finished Null Pointer Test");
	}
}
