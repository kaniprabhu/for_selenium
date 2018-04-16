package learningjava;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str1="TestLeaf Java";
	String str2="TestLeaf Java";
	String str3=new String("TestLeaf Java");
	String str4=new String("testleaf java");
	String str5=new String("Java");
	compareString(str1,str2);
	equalsString(str1,str2);
	stringCompare(str1,str3);
	stringEquals(str1,str3);
	equalsIgnoreCase(str1,str4);
	System.out.println(str1.equalsIgnoreCase(str4));
	containsString(str3,str5);
	System.out.println(str3.contains(str5));
}
	public static void compareString(String s1, String s2)
	{
		if (s1==s2)
		{
			System.out.println("The Strings are equal");
		}
		else
		{
			System.out.println("Strings not equal");
		}
	}
	public static void equalsString(String s1, String s2)
	{
		if (s1.equals(s2))
		{
			System.out.println("The Strings are equal");
		}
		else
		{
			System.out.println("Strings not equal");
		}
	}
	public static void stringCompare(String s1, String s2)
	{
		if (s1==s2)
		{
			System.out.println("The Strings are equal");
		}
		else
		{
			System.out.println("Strings not equal");
		}
	}
	public static void stringEquals(String s1, String s2)
	{
		if (s1.equals(s2))
		{
			System.out.println("The Strings are equal");
		}
		else
		{
			System.out.println("Strings not equal");
		}
	}
	public static void equalsIgnoreCase(String s1, String s2)
	{
		if (s1.equalsIgnoreCase(s2))
		{
			System.out.println("Strings are equal Ignore Case");
		}
		else
		{
			System.out.println("Strings not equal Ignore Case");
		}
	}
	public static void containsString(String s1, String s2)
	{
		if (s1.contains(s2))
		{
			System.out.println("Display the Strings are Contains");
		}
		else
		{
			System.out.println("Display the Strings not Contains");
		}
	}
	
	

}
