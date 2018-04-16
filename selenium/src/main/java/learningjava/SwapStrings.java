package learningjava;

import java.util.Scanner;

public class SwapStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First String :");

		String firstString = scan.next();

		System.out.println("Enter Second String :");

		String secondString = scan.next();

		System.out.println("Before Swapping :");

		System.out.println("First String Is : "+firstString);

		System.out.println("Second String Is : "+secondString);

		//Swapping starts

		firstString = firstString + secondString;

		secondString = firstString.substring(0, firstString.length()-secondString.length());

		firstString = firstString.substring(secondString.length());

		//Swapping ends

		System.out.println("After Swapping :");

		System.out.println("First String Is : "+firstString);

		System.out.println("Second String Is : "+secondString);

	}

}
