package learningjava;

import java.util.Scanner;

/*
 * Program: Write a Java program to print Floyd triangle by getting the number of rows.
*/

public class FloydTriangle {

	public static void main(String[] args) {
//		Declare and initialize the variables.
		int numberOfRows, rows,columns, number=1;
//		Get User inputs how many rows wants to print Flyod's triangle
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows of Floyd's Triangle to print: ");
		numberOfRows=scan.nextInt();
//		Nested for loops using to print Floyd's triangle		
		for(rows=1;rows<=numberOfRows;rows++)
		{
			for(columns=1;columns<=rows;columns++)
			{
				System.out.print(number+" ");
//		Incrementing the value
				number++;
			}
//		Print next line			
			System.out.println();
			scan.close();
		}

	}

}
