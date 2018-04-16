package annotations;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class SkipAnnotations {
	
	@Test
	public void c_test() {
		Assert.fail();
	}
	
	@Test
	public void a_test()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void b_test() {
		throw new SkipException("Skipped b_test");
	}

}
