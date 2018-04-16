package learningjava;

import java.util.HashSet;
import java.util.Set;

//		Find repeated numbers in an Array of int.

public class DuplicateArrayValue {

	public static void main(String[] args) {
// 		1. Declare array
		
/*		int[] array = {13,15,67,88,65,67,13,13,99,67,65,13,87,13};
		Set<Integer> set = new HashSet<Integer>();

//		Loop for iterating 
		for(int i = 0; i < array.length ; i++)
		{
//			If same integer is already present then add method will return FALSE
			if(set.add(array[i]) == false)
			{
//			Print all duplicate numbers
				System.out.println("Duplicate numbers are : " + array[i]);
			}
		}
*/		
		int[] array={1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7};
		Set<Integer> set=new HashSet<Integer>();
		System.out.println("The duplicate numbers are: ");
		for(Integer num:array)
		{
			if(set.add(num)==false)
				System.out.print(num+" ");
		}
		}
	}
//}
