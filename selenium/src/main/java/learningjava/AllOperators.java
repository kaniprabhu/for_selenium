package learningjava;

public class AllOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Arithmetic Operators
		int firstNumber=18,secondNumber=7,result=0;
		
		result=firstNumber+secondNumber;
		System.out.println("Addition of Two Numers:"+result);
		
		result=firstNumber-secondNumber;
		System.out.println("Subtraction of Two Numers:"+result);
		
		result=firstNumber*secondNumber;
		System.out.println("Multiplication of Two Numers:"+result);
		
		result=firstNumber/secondNumber;
		System.out.println("Division of Two Numers:"+result);
		
		result=firstNumber%secondNumber;
		System.out.println("Remainder Number:"+result);
		
		// Relational Operators
		int number=10;
		
		if(number==10)
			System.out.println("Checking Equal operator");
		
		if(number!=20)
			System.out.println("Checking Not equal operator");
		
		if(number>0)
			System.out.println("Checking Greater than operator");
		
		if(number>=5)
			System.out.println("Checking Greater than or equalto operator");
		
		if(number<15)
			System.out.println("Checking Less than Operator");
		
		if(number<=11)
			System.out.println("Checking Less than or equal to operator");
		
		// Logical Operator
		boolean a =true;
		boolean b=false;
		boolean c;
		
		c=a&&b;
		System.out.println("Checking Logical AND Operator "+c);
		
		c=a||b;
		System.out.println("Checking Logical OR Operator "+c);
		
		c=!(a&&b);
		System.out.println("Checking Logical NOT Operator "+c);
		
		c=!(a||b);
		System.out.println("Checking Logical NOT Operator "+c);
		
		// Bitwise Operators
		int bitNumber1 = 90;
		int bitNumber2 = 45;
		int bitResult;
		
		bitResult = ~bitNumber1;
		System.out.println("Checking ~ : " + bitResult);
		
		bitResult = bitNumber1 & bitNumber2;
		System.out.println("Checking & : " + bitResult);
		
		bitResult = bitNumber1 | bitNumber2;
		System.out.println("Checking |: " + bitResult);
		
		bitResult = bitNumber1 ^ bitNumber2;
		System.out.println("Checking ^: " + bitResult);
		
		bitResult = bitNumber1 << 2;
		System.out.println("Checking <<: " + bitResult);
		
		bitResult = bitNumber1 >> 2;
		System.out.println("Checking >> : " + bitResult);
		
		bitResult = bitNumber1 >>> 2;
		System.out.println("Checking >>>: " + bitResult);
		
		// Ternary Operators
		int num1=20,num2=10,terResult;
	 
	    terResult = (num1 > 10) ? num1 : num2;
	    System.out.println("Ternary Operators result: " + terResult);
	 
	    terResult = (num2 > 10) ? num1 : num2;
	    System.out.println("Ternary Operator result: " + terResult);
		
	}

}

