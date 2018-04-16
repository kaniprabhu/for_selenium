package learningjava;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNumber=432;
		int number=inputNumber;
		int sumOfDigits=0,reminder;
		while(inputNumber!=0)
		{
			reminder=inputNumber%10;
			sumOfDigits=sumOfDigits+reminder;
			inputNumber=inputNumber/10;
		}
		System.out.println("Sum of Digits in  "+number+" is "+sumOfDigits);

	}

}
