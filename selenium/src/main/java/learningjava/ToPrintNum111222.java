package learningjava;



public class ToPrintNum111222 {

	public static void main(String[] args) {
		
		for(int i=111;i<=1000;i++) {
			int x=i;
			String str = Integer.toString(x);
			String a =str.substring(0, 1);
			String b = str.substring(1, 2);
			String c = str.substring(2, 3);
			  if(a.equalsIgnoreCase(b) && b.equalsIgnoreCase(c)){
				System.out.println(a+b+c);
			}
		}
	}

}
