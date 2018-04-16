package learningjava;

import java.util.Scanner;

public class FIZZBUZZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=0,number2=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		number1=scan.nextInt();
		System.out.print("Enter the Number: ");
		number2=scan.nextInt();
		for(int i=number1;i<=number2;i++) 
		{
			if((i%3==0)&&(i%5==0))
			{
					System.out.print("FIZZBUZZ  ");
			}
			else if (i%5==0)
				{
					System.out.print("BUZZ  ");
				}
			else if (i%3==0)
				{
					System.out.print("FIZZ   ");
				}
			else
				{
					System.out.print(i+"  ");
				}
				scan.close();
		}
	}

}
