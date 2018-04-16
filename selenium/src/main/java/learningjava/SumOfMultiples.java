package learningjava;

public class SumOfMultiples {

	public static void main(String[] args) {
		SumOfMultiples sum=new SumOfMultiples();
		System.out.println(sum.run());
}
	
public String run() {		
		int sum=0;
		for(int i=0;i<100;i++)
		{
			if((i%3==0)||(i%5==0))
				sum=sum+i;
		}
		return Integer.toString(sum);
	}

}
