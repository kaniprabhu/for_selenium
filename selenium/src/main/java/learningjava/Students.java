package learningjava;

import java.util.Scanner;
public class Students {
	public String studName;
	public void studDetails()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Student Name: ");
		studName=scan.nextLine();
		scan.close();
	}

}
