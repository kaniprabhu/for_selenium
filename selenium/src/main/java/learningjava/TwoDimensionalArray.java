package learningjava;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][]details= {{"Siva","B +"},{"Kala","AB +"},{"Anish","O +"},{"Puvissha","O -"}};
		
		for(int r=0;r<=3;r++)
		{
			for(int c=0;c<=1;c++)

System.out.println();
		}
		
		for(int r=0;r<=3;r++)
		{
			System.out.print(details[r][0]+"  ");
			System.out.println(details[r][1]+"  ");
		}
		System.out.println();
		
		for(String detail[]:details)
		{
			for(String name:detail)
			{
				System.out.print(name+"        ");
			}
			System.out.println();
		}
		
		for(String detail[]:details)
		{
			System.out.print(detail[0]);
			System.out.println("   "+detail[1]);
		}
		
	}

}
	
