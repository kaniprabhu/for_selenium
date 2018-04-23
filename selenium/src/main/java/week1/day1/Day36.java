package week1.day1;

import java.util.Scanner;



public class Day36 {

	public static void main(String[] args) {
		int intarr[] = null;
		
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the number");
		int input=s.nextInt();
//		int inputarr[]=input.
		String str=Integer.toString(input);
		String strarr[]=str.split("");
		/*for(int i=0;i<str.length();i++) {
			System.out.println(strarr[i]);
		}*/
		
		for (String str1 : strarr) {
			for(int i=0;i<str.length();i++) {
			intarr[i]=Integer.parseInt(str1);
			}
			
		}
		
		for(int i=0;i<str.length();i++) {
			System.out.println(intarr[i]);
		}
		
		/*for(int i=0; i<str.length(); i++)
		{
			for(int j=1;j<=i; j++) {
				int a = Integer.parseInt(strarr[i]);
				int b = Integer.parseInt(strarr[i]);
				if(a<b) {
					a=b;
				}
				
			}
		}*/

	}

}
