package firstdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
	
	@BeforeSuite
	public void bsuite() {
		System.out.println("Test case for -- Before suite");
	}
	@BeforeTest
	public void btest() {
		System.out.println("Test case for -- Before Test ");
	}
	@BeforeClass
	public void bclass() {
		System.out.println("Before class............");
	}
	
	@BeforeMethod(enabled=false)
	public void bmethod() {
		System.out.println("Before Method");
	}
	@Test(enabled=false)
	public void testcase1() {
		System.out.println("Test case - 3");
	}
	@Test
	public void testcase2() {
		System.out.println("Test case - 4");
	}
	
	@AfterMethod(enabled=false)
	public void amethod() {
		System.out.println("After Method");
		
	}
	
	@AfterClass
	public void aclass() {
		System.out.println("After class");
	}
	@AfterTest
	public void atest() {
	System.out.println("After Test");	
	}
	
	@AfterSuite
	public void asuite() {
		System.out.println("After suite");
	}
	
	
	}


