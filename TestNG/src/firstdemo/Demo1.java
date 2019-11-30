package firstdemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	
	@BeforeMethod
	public void bmethod() {
		System.out.println("Before Method - 1");
	}
	@Test()
	public void testcase1() {
		System.out.println("Test case 1");
	}
	
	@Test
	public void testcase2() {
		System.out.println("Test case 2");
	}
	
//	@Test(priority=1)
//	public void testcase1() {
//		System.out.println("Test case 1");
//	}
//	@Test(enabled=false)
//	public void testcase2() {
//		System.out.println("Test case 2");
//	}
	
	@AfterMethod
	public void amethod() {
		System.out.println("After Method - 2");
	}

}
