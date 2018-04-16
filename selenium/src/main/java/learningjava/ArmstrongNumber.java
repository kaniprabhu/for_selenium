package learningjava;

/*
 * Program: Write a Java Program to print the Armstrong number from 100 to 1000.
 * Coding Challenge: Week3 and Day1
 * Date: 10.03.2018
 * */

public class ArmstrongNumber {

	public static void main(String[] args) {
//		Initialize the variables
		int number,armNumber,reminder;
// Using for loop to iterate numbers 100 to 1000. Checking every number between 100 to 1000 and verify it is Armstrong number or not.		
		for(int i=100;i<=1000;i++)
		{
			number=i;
			armNumber=0;
// Find the cubic armstrong number of digits and store it in armstrong number variable.
			while(number!=0)
			{
				reminder=number%10;
				number=number/10;
				armNumber=armNumber+(reminder*reminder*reminder);
			}
// Compare i and armstrong number. If both are equal then the number is Armstrong number. Print the Armstrong Number
			if(i==armNumber)
			{
				System.out.println(i+" is Armstrong Number ");
			}
		}
	}
}
