package learningjava;

import java.util.Scanner;

public class MathLibraryFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data = new Scanner(System.in);
		double num1,num2,num;
		System.out.println("Enter a number");
		num1=data.nextDouble();
		System.out.println("Enter a number");
		num2=data.nextDouble();
		data.close();

		num=Math.abs(-2.5);
		System.out.println("absolute:"+num);

		num=Math.min(num1,num2);
		System.out.println("min:"+num);

		num=Math.max(num1,num2);
		System.out.println("max:"+num);

		num=Math.ceil(8.4);
		System.out.println("ceil:"+num);

		num=Math.floor(8.4);
		System.out.println("floor:"+num);

		num=Math.pow(num1, num2);
		System.out.println("power:"+num);

		num=Math.sqrt(num1);
		System.out.println("sqrt:"+num);

		num=Math.cbrt(num2);
		System.out.println("cbrt:"+num);

		num=Math.copySign(num1,-8.2);
		System.out.println("copysign:"+num);

		num=Math.exp(2);
		System.out.println("exp:"+num);

		num=Math.expm1(2);
		System.out.println("Expm1:"+num);
		
		num=Math.max(15, 25);
		System.out.println("Max:"+num);

		num=Math.min(10.4,15.8);
		System.out.println("Min:"+num);

		

		}
	}
