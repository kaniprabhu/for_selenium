package learningjava;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=0,number2=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the First Number:  ");
		number1=scan.nextInt();
		System.out.print("Enter the Second Number:  ");
		number2=scan.nextInt();
		System.out.println("Before Swap the First Number is "+number1+" and the Second Number is "+number2);
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		System.out.println("After Swap the First Number is "+number1+" and the Second Number is "+number2);
		scan.close();
	}

}
