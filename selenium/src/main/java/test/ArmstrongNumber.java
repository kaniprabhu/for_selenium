package test;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int temp,number,rev=0,total=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		number=scan.nextInt();
		scan.close();
		temp=number;
		while(number>0)
		{
			rev=number%10;
			total=total+(rev*rev*rev);
			number=number/10;
		}
		if(temp==total)
		{
			System.out.println("Number is Armstrong Number");
		}
		else
		{
			System.out.println("Number is not Armstrong Number");
		}
	}

}
