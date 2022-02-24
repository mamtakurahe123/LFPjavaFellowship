package basicjavaprogram;

import java.util.Scanner;

public class ArithmeticOpration {
	public static void main (String args[]) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			System.out.println("Enter First Number");
			int num1 = in.nextInt();
			
			System.out.println("Enter Second Number");
			int num2 = in.nextInt();
			
			int addition = num1 + num2;
			System.out.println("addition of two number is = " + addition);
			
			int subtration = num1 - num2;
			System.out.println("subtraction of two number is = " + subtration);
			
			int multipication = num1 * num2;
			System.out.println("multipication of two number is = " + multipication);
			
			int division = num1 / num2;
			System.out.println("division of two number is = " + division);
		}
		

	}
}
