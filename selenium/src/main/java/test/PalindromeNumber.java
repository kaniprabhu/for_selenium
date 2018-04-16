package test;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num,temp,r,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num=scan.nextInt();
		scan.close();
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
	}

}
