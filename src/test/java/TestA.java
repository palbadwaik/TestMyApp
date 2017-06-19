import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestA {

	@Test
	public void testA(){
		System.out.println("In Test A");
	}

	@BeforeMethod
	public static void beforeTestAMethod(){
		System.out.println("Before Test A method");
	}

	@AfterMethod
	public static void afterTestAMethod(){
		System.out.println("After Test A method");
	}

	@BeforeTest
	public static void beforeTestA(){
		System.out.println("Before Test A");
	}

	@AfterTest
	public static void afterTestA(){
		System.out.println("After Test A");
	}

	@BeforeSuite
	public static void beforeSuiteTestA(){
		System.out.println("Before Suite");
	}

	@AfterSuite
	public static void afterSuiteTestA(){
		System.out.println("After Suite");
	}
	@BeforeClass
	public static void beforeClassTestA(){
		System.out.println("Before class");
	}

	@AfterClass
	public static void afterClassTestA(){
		System.out.println("After class");
	}

}
