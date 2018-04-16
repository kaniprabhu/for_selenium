package wdMethods;

import org.junit.Test;

public interface Sample{
		public void print();
}
class B implements Sample{
	@Test
	public void print()
	{
		System.out.println("Hi");
	}
		Sample sam=new B();
//		sam.print();
	}



