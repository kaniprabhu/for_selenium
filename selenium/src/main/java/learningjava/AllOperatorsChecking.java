package learningjava;

import java.util.Scanner;

public class AllOperatorsChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=scan.nextInt();
		scan.close();
		if((num>=10)&&(num<100))
			System.out.println("User enter the two digit number");
		else if ((num>=0)&&(num<10))
			System.out.println("User enter the one digit number");
		else if ((num<0)||(num>=100))
			System.out.println("User enters either negative number or more than two digit number");;
		boolean flag=true;
//		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num1=scan.nextInt();
		System.out.println(num1++);
		System.out.println(num1);
		System.out.println(++num1);
		System.out.println(num1);
		System.out.println(num1--);
		System.out.println(num1);
		System.out.println(--num1);
		System.out.println(num1);
		if((num>10)||flag)
			System.out.println("User enters more than two digit number or other");
		else
			System.out.println("Not satisfied");
		System.out.println(flag);
		System.out.println(!flag);
	}

}
