package basicjavaprogram;
import java.util.Scanner;

public class DivitionofTwoNumber {
	public static void main (String args[]) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Number");
		int divident = in.nextInt();
		
		System.out.println("Enter Second Number");
		int divisor  = in.nextInt();
		
		int quotient = divident/divisor ;
		System.out.println("quotient of two number is = " + quotient);
	}
}
