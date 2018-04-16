package learningjava;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int inputNumber=scan.nextInt();
		scan.close();
		for(int i=1;i<=inputNumber;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+inputNumber+" is "+fact);

	}

}
