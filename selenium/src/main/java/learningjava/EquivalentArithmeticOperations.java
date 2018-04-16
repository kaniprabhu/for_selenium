package learningjava;

import java.util.Scanner;

public class EquivalentArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber=0,secondNumber=0,result=0;
		String s;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First Number:");
		firstNumber=scan.nextInt();
		System.out.println("Enter Second Number:");
		secondNumber=scan.nextInt();
		System.out.print("Enter Operator(Add/Subtract/Multiply/Divide) :");
		s=scan.next();
		scan.close();
		if(s.contains("Add"))
		{
			result=firstNumber+secondNumber;
			System.out.println("Addition of two number result is : "+result);
		}
		else if(s.contains("Subtract"))
		{
			result=firstNumber-secondNumber;
			System.out.println("Subtraction of two number result is : "+result);
		}
		else if(s.contains("Multiply"))
		{
			result=firstNumber*secondNumber;
			System.out.println("Multiplication of two number result is : "+result);
		}
		else if(s.contains("Divide"))
		{
			
			result=firstNumber/secondNumber;
			System.out.println("Division of two number result is : "+result);
		}
		else
		{
			System.out.println("Entered Wrong operators");
		}
	}

}
