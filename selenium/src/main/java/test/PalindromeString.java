package test;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String rev="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=scan.nextLine();
		scan.close();
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str))
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Given string is not palindrome");
		}
	}

}
