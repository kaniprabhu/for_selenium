package annotations;

import org.testng.annotations.*;

public class LearningAnnotationsTwo {
	
	@Test(priority=1, invocationCount=3,alwaysRun=true,description="Main Method")
	public void mainTest()
	{
		System.out.println("In MainTest");
	}
	
	@Test(priority=0, invocationCount=5,threadPoolSize=4)
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
