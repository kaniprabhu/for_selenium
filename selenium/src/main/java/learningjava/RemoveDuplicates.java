package learningjava;

import java.util.Scanner;

public class RemoveDuplicates {
	public static int[] removeDuplicates(int[] input)
	{
		int j = 0;
		int i = 1;
		// return if the array length is less than 2
		if (input.length < 2)
		{
			return input;
		}
		while (i < input.length)
		{
			if (input[i] == input[j])
			{
				i++;
			}
			else
			{
				input[++j] = input[i++];
			}
		}
		int[] output = new int[j + 1];
		for (int k = 0; k < output.length; k++)
		{
			output[k] = input[k];
		}
		return output;
	}
	public static void main (String[] args) 
	{
		int temp;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int input=scan.nextInt();
		int[] input1=new int[input];
		System.out.println("Enter all the elements:");
		for(int i = 0; i < input; i++)
		{
			input1[i] = scan.nextInt();
		}

		int[] output = removeDuplicates(input1);

		System.out.print("Input Elements: \n");
		for (int i : input1)
		{
			System.out.print(i + " ");
		}
		System.out.print("\nOutput Elements: \n");

		for (int i : output)
		{
			System.out.print(i + " ");
		}
	}
}
