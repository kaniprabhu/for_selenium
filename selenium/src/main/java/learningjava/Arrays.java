package learningjava;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[50];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length os string array: ");
		int length=scan.nextInt();
//		String[] input=new String[length];
		System.out.println("Enter array elements");
		scan.close();
		for(int i=0;i<length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.print("Elements of array is:{ ");
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println("}");
	}

}
