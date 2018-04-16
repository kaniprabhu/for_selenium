package learningjava;

import java.util.Scanner;

public class SecondMulTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tableNumber=2,number;
		System.out.print("Enter the Number: ");
		Scanner scan=new Scanner(System.in);
		number=scan.nextInt();
		scan.close();
		for(int i=1;i<=number;i++)
		{
			System.out.println(i+" * "+tableNumber+" = "+(i*tableNumber));
		}
	}
}
