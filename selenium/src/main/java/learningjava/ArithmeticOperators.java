package learningjava;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Arithmetic Operators
		int sum=add(18,25);
		System.out.println(sum);
		int subtraction=sub(25,15);
		System.out.println(subtraction);
		int multi=mul(31,15);
		System.out.println(multi);
		int division=div(25,5);
		System.out.println(division);
	}
		public static int add(int num1, int num2)
		{
			System.out.println(num1+num2);
			return(num1+num2);
		}
		public static int sub(int num1, int num2)
		{
			System.out.println(num1-num2);
			return(num1-num2);
		}
		public static int mul(int num1, int num2)
		{
			System.out.println(num1*num2);
			return(num1*num2);
		}
		public static int div(int num1, int num2)
		{
			System.out.println(num1/num2);
			return(num1/num2);
		}
		
	}



