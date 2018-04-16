package learningjava;

import java.util.Scanner;

public class WithoutSpaceString {

	public static void main(String[] args) {
		String text="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the with space String: ");
		text=scan.nextLine();
		while(text.indexOf("  ") >= 0)
		{
		text = text.replaceAll("  ", " ");
		}
		System.out.println(text);
		scan.close();

	}

}
