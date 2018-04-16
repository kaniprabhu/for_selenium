package annotations;

import org.testng.annotations.*;

public class DependsOnMethods {

	@Test
	public void a() {
		System.out.println("a");
	}

	@Test(dependsOnMethods={"c"})
	public void b() {
		System.out.println("b");
	}

	@Test(dependsOnMethods={"a"})
	public void c() {
		System.out.println("c");
	}

	@Test
	public void d() {
		System.out.println("d");
	}
}
