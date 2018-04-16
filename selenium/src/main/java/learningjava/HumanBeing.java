package learningjava;

public class HumanBeing {
	public static String name;
	private static int mobileNumber;
	static char aadhaarNumber;
	protected static boolean bankAccount;

	public static void details()
	{
		System.out.println(name);
		System.out.println(mobileNumber);
		System.out.println(aadhaarNumber);
		System.out.println(bankAccount);
	}
	private static void mobile()
	{
		System.out.println(name);
		System.out.println(mobileNumber);
	}
	static void bank()
	{
		System.out.println(name);
		System.out.println(aadhaarNumber);
	}
	protected static void aadhaar()
	{
		System.out.println(name);
		System.out.println(aadhaarNumber);
	}
 
}
