package learningjava;

/*
 * Write a Java program to find out if the given year is leap year or not.
 * 
 * A year that is exactly divisible by 4 is leap year, 
 * except for years that are exactly divisible by 100, 
 * but these centurial years are leap years if they are exactly divisible by 400. 
 * For example, the years 1700, 1800 and 1900 were not leap years,but the years 1600 and 2000 are.
*/
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
// Declare the variable		
		int year;
		Scanner scan=new Scanner(System.in);
// Get the input from user		
		System.out.println("Enter year to verify leap year or not: ");
		year=scan.nextInt();
// If the year is divisible 400 then the year is leap year
// If the year is divisible by 4 and the year is not divisible by 100 then the year is leap year		
		if((year%400==0)||((year%4==0)&&(year%100!=0)))
		{
// Print the result			
			System.out.println("Entered Year "+year+" is leap year");
		}
		else
		{
			System.out.println("Entered Year "+year+" not is leap year");
		}
		scan.close();

	}

}
