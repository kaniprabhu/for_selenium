package test;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num,temp;
		boolean IsPrime=true;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num=scan.nextInt();
		scan.close();
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				IsPrime=false;
				break;
			}
		}
		if(IsPrime)
		{
			System.out.println("Entered number is Prime Number");
		}
		else
		{
			System.out.println("Entered Number is not Prime Number");
		}
	}

}
