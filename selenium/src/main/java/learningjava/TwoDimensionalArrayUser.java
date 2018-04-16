package learningjava;

import java.util.Scanner;

public class TwoDimensionalArrayUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[50];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of Matrix Rows: ");
		int matrixRows=scan.nextInt();
		System.out.println("Enter the number of Matrix Columns: ");
		int matrixColumns=scan.nextInt();
		int[][] matrix=new int[matrixRows][matrixColumns];
		enterMatrixData(scan,matrix,matrixRows,matrixColumns);
		printMatrix(matrix,matrixRows,matrixColumns);
	}
	
	public static void enterMatrixData(Scanner scan, int[][] matrix, int matrixRows, int matrixColumns)
	{
		System.out.println("Enter Matrix Data");
		for(int i=0;i<matrixRows;i++)
		{
			for(int j=0;j<matrixColumns;j++)
			{
				matrix[i][j]=scan.nextInt();
			}
		}
	}
	
	public static void printMatrix(int[][] matrix, int matrixRows, int matrixColumns)
	{
		for(int i=0;i<matrixRows;i++)
		{
			for(int j=0;j<matrixColumns;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
