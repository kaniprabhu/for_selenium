package test;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=scan.nextInt();
		scan.close();
		int fact=1;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial Number of "+number+" is "+fact);
	}

}
