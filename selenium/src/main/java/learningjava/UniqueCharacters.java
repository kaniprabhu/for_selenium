package learningjava;

import java.util.*;

public class UniqueCharacters {

	public static void main(String[] args) {
		String inputString1="";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Input String: ");
		String inputString=scan.nextLine();
		for(int i=0;i < inputString.length();i++)
		{
			if(inputString1.indexOf(inputString.charAt(i))==-1)
				inputString1=inputString1+(inputString.charAt(i));

		}
		System.out.println("Unique Characters of Input String Is: "+inputString1);
		scan.close();
	}

}
