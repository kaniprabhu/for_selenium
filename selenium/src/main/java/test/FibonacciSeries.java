package test;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1=0,num2=1,num3,count;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Fibonacci Series to display: ");
		count=scan.nextInt();
		scan.close();
		System.out.println("Fibonacci Series of "+count+" numbers are ");
		int i=1;
		while(i<=count)
		{
			System.out.println(num1);
			num3=num1+num2;
			num1=num2;
			num2=num3;
			i++;
		}
	}

}
