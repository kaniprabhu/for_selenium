package learningjava;

import java.text.DecimalFormat;

public class PercentageString {

	static void characterPercentage(String inputString)
	{
		//Getting total no of characters in the given string
		int totalChars = inputString.length();
		//Initializing upperCaseLetters, lowerCaseLetters, digits and others with 0
		int upperCaseLetters = 0;
		int lowerCaseLetters = 0;
		int digits = 0;
		int others = 0;
		//Iterating through each character of inputString
		for (int i = 0; i < inputString.length(); i++) 
		{
			char ch = inputString.charAt(i);
			//If ch is in uppercase, then incrementing upperCaseLetters
			if(Character.isUpperCase(ch))
			{
				upperCaseLetters++;
			}
			//If ch is in lowercase, then incrementing lowerCaseLetters
			else if(Character.isLowerCase(ch))
			{
				lowerCaseLetters++;
			}
			//If ch is a digit, then incrementing digits
			else if (Character.isDigit(ch))
			{
				digits++;
			}
			//If ch is a special character then incrementing others
			else
			{
				others++;
			}
		}
		//Calculating percentage of uppercase letters, lowercase letters, digits and other characters
		double upperCaseLetterPercentage = (upperCaseLetters * 100.0) / totalChars ;
		double lowerCaseLetterPercentage = (lowerCaseLetters * 100.0) / totalChars;
		double digitsPercentage = (digits * 100.0) / totalChars;
		double otherCharPercentage = (others * 100.0) / totalChars;
		DecimalFormat formatter = new DecimalFormat("##.##");
		//Printing percentage of uppercase letters, lowercase letters, digits and other characters
		System.out.println("Given Input String is: '"+inputString+"'  ");
		System.out.println("Number of Uppercase letters are "+upperCaseLetters+". So percentage is "+formatter.format(upperCaseLetterPercentage)+"% ");
		System.out.println("Number of Lowercase letters are "+lowerCaseLetters+". So percentage is "+formatter.format(lowerCaseLetterPercentage)+"%");
		System.out.println("Number of Digits Are "+digits+". So percentage is "+formatter.format(digitsPercentage)+"%");
		System.out.println("Number of Other Characters Are "+others+". So percentage is "+formatter.format(otherCharPercentage)+"%");
		System.out.println("-----------------------------");
	}
	public static void main(String[] args) {
		characterPercentage("Tiger Runs @ The Speed Of 100 km/hour.");
	}
}