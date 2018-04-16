package learningjava;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc = new Scanner(System.in);
      System.out.println("Name: ");
      String name = sc.nextLine();
      System.out.println("Gender: ");
      char gender = sc.next().charAt(0);
      System.out.println("Age: ");
      int age = sc.nextInt();
      System.out.println("Mobile Number: ");
      long mobileNo = sc.nextLong();
      System.out.println("CGPA: ");
      double cgpa = sc.nextDouble();
      sc.close();
	}

}
