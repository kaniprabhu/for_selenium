package learningjava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputNumber=0,remainder=0,temp=0,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Number:");
		inputNumber=scan.nextInt();
		scan.close();
		temp=inputNumber;
		while(inputNumber!=0)
		{
			remainder=inputNumber%10;
			sum=(sum*10)+remainder;
			inputNumber=inputNumber/10;
		}
		if(temp==sum)
		{
			System.out.println("Given Number is Palindrome");
		}
		else
		{
			System.out.println("Given Number is not Palindrome");
		}
	}

}
