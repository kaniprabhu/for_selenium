package learningjava;

import java.util.Scanner;

public class StringPalindrome {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name,reverse="";
		System.out.println("Enter the Name:");
		Scanner scan=new Scanner(System.in);
		name=scan.nextLine();
		scan.close();
		int str=name.length();
		for(int i=str-1;i>=0;i--)
		{
			reverse=reverse+name.charAt(i);
		}
		if(name.equals(reverse))
		{
	            System.out.println(name + " is a palindrome");
		}
	    else
	    {
	            System.out.println(name + " is not a palindrome");
	    }
	}

}
