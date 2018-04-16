package annotations;

import org.testng.annotations.*;

public class LearningAnnotationsThree {
	
	@Test(description="Starting Method")//(priority=1)
	public void mainTest()
	{
		System.out.println("In MainTest");
	}
	
	@Test//(priority=0)
	public void startTest()
	{
		System.out.println("In Start Test");
	}
	
/*	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("In BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("In After Method");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("In BeforeClass");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("In AfterClass");
	}
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("In BeforeTest");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("In AfterTest");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("In BeforeSuite");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("In AfterSuite");
	}
*/
}
