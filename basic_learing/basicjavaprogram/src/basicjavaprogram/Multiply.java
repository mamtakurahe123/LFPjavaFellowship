package basicjavaprogram;
import java.util.Scanner;

public class Multiply {
	public static void main (String args[]) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = in.nextInt();
		
		System.out.println("Enter Second Number");
		int multiplier = in.nextInt();
		
		int product = num1 *  multiplier;
		System.out.println("sum of two number is = " + product);
		

	}

}
