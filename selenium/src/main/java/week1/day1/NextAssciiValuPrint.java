package week1.day1;

import java.util.Scanner;

public class NextAssciiValuPrint {

	public static void main(String[] args) {
		
		String out ="";

		//Getting input from user
		System.out.println("enter the struing");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		for(int i=0;i<str.length();i++) {
			char k = str.charAt(i);
			int asc=(int) k;
			asc++;
			char temp=(char)asc;
			out=out+temp;
		}
		System.out.println(out);

	}

}
