package learningjava;

import java.util.Scanner;

/*
 * Write a Java method to check whether a string is a valid password
 * 1. A password must have at least ten characters
 * 2.A password consists of only letters and digits
 * 3. A password must contain at least two digits and two letters
 * 4. A password must contain at least one Capital letter
*/

public class ValidPassword {

	public static void main(String[] args) {
		
		  // TODO Auto-generated method stub
	    int min =10;
	    int max=16;
	    int digit=0;
	    int special=0;
	    int upCount=0;
	    int loCount=0;
	    String password;
	    Scanner scan = new Scanner(System.in);
	    System.out.println(" Enter Your Password:");
	        password = scan.nextLine();
	    if(password.length()>=min){
	        for(int i =0;i<password.length();i++){
	            char c = password.charAt(i);
	            if(Character.isUpperCase(c)){
	                upCount++;
	            }
	            if(Character.isLowerCase(c)){
	                loCount++;
	            }
	            if(Character.isDigit(c)){
	                digit++;
	            }
	        }
	        if(special>=1&&loCount>=1&&upCount>=1&&digit>=1){
	            System.out.println(" Password is good:");
	        }

	    }

	    if(password.length()<min){

	        for(int i =0;i<password.length();i++){
	            char c = password.charAt(i);
	            if(Character.isLowerCase(c)){
	                loCount++;
	            }
	            }

	        if(loCount>0){
	            System.out.println(" Password must be atleat "+min+" characters:");
	            System.out.println(" You need atleast one upper case chracter:");
	            System.out.println(" You need atleast one digit:");
	            System.out.println(" You need atleast one special chracter:");



	    }
	    }
	    else if(password.length()<min&&upCount>1){
	        for(int i =0;i<password.length();i++){
	        char c =password.charAt(i);
	        if(Character.isLowerCase(c)){
	            loCount++;
	        }
	         if(Character.isUpperCase(c)){
	            upCount++;
	        }
	        }
	        if(loCount>0&&upCount>0){
	        System.out.println(" Password must be atleast "+min+" chracters:");
	        System.out.println(" You need atleast one digit:");
	        System.out.println(" You need atleast one special chracter:");
	    }
	    }
	     if(password.length()>max||password.length()>=max&&upCount>1&&loCount>1&&digit>1){
	         System.out.println(" Password is too long.Limit is "+max+" chracters:");
	                 System.out.println(" You need atleast one special chracter:");

	        }
	      if(password.length()>=min&&password.length()<=max&&loCount>0&&upCount>0&&digit>0&&special==0){
	         System.out.println(" You need atleast a special chracter");
	     }
	      if(password.length()>=min&&password.length()<=max&&loCount>0&&upCount>0&&digit==0&&special==0){
	         System.out.println(" You need atleast one digit:");
	         System.out.println(" You need atleast one special chracter:");
	     }
	   }
	}
	
/*		 Scanner input = new Scanner(System.in);
	        System.out.print(
	                "1. A password must have at least ten characters.\n" +
	                "2. A password consists of only letters and digits.\n" +
	                "3. A password must contain at least two digits \n" +
	                "4. A password must contain at least one Capital letter \n"+
	                "Input a password (You are agreeing to the above Terms and Conditions.): ");
	        String password = input.next();
	        if (isValid(password)) {
	            System.out.println("Valid Password");
	        } else {
	            System.out.println("Invalid Password");
	        }
	    }
	    public static boolean isValid(String password) {
	        if (password.length() < 10) { 
	            return false;
	        } else {    
	            char c;
	            int count = 1; 
	            for (int i = 0; i < password.length() - 1; i++) {
	                c = password.charAt(i);
	                if (!Character.isLetterOrDigit(c)) {        
	                    return false;
	                } else if (Character.isDigit(c)) {
	                    count++;
	                    if (count < 2)   {   
	                        return false;
	                    }   
	                }
	            }
	        }
	        return true;
	}
*/
