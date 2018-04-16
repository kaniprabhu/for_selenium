package testcases;

import org.testng.annotations.Test;

import wdMethods.ProjMethods;

public class TestCase3 {
	@Test(invocationCount=2)
	public void create() {
		System.out.println("create");
	}
	@Test (dependsOnMethods= {"testcases.TestCase3.create"})
	public void edit() {
		System.out.println("edit");
	}
	@Test (dependsOnMethods= {"testcases.TestCase3.create"})
	public void delete() {
		System.out.println("delete");
	}
	@Test(enabled=false)
	public void duplicate() {
		System.out.println("duplicate");
	}
	@Test(timeOut=2000)
	public void merge() {
		System.out.println("merge");
	}
}
