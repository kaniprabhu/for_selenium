package testcases;

import org.testng.annotations.Test;

public class AnnotationAttribute {
	@Test(invocationCount=2)
	public void createLead()
	{
		System.out.println("Create Lead");
	}
	@Test(enabled=false)
	public void mergeLead()
	{
		System.out.println("Merge Lead");
	}
	@Test(dependsOnMethods= {"testcases.AnnotationAttribute.createLead"})
	public void editLead()
	{
		System.out.println("Edit Lead");
	}
}
