package TestNGSessions14;

import org.testng.annotations.Test;

public class PriorityTest2 {
	
	@Test
	public void a_test() {
		System.out.println("a test");
	}
	
	@Test
	public void b_test() {
		System.out.println("b test");
	}
	
	@Test
	public void c_test() {
		System.out.println("c test");
	}
	
	@Test(priority=5)
	public void d_test() {
		System.out.println("d test");
	}
	
	@Test(priority=3)
	public void e_test() {
		System.out.println("e test");
	}
}
