package learningjava;

import java.util.Scanner;

public class SecondLargestArray {

	public static void main(String[] args) {
		int number, temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of elements in array :");
		number = scan.nextInt();
		int array[] = new int[number];
		System.out.println("Enter all the array elements:");
		for (int i = 0; i < number; i++) 
		{
			array[i] = scan.nextInt();
		}
		for (int i = 0; i < number; i++) 
		{
			for (int j = i + 1; j < number; j++) 
			{
				if (array[i] > array[j]) 
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Second Largest Integer Array:"+array[number-2]);
		System.out.println("Smallest Integer Array:"+array[0]);
		scan.close();
	}
}
