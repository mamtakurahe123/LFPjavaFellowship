package basicjavaprogram;
import java.util.Scanner;

public class AddTwoNumber {
	public static void main (String args[]) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			System.out.println("Enter First Number");
			int num1 = in.nextInt();
			
			System.out.println("Enter Second Number");
			int num2 = in.nextInt();
			
			int sum = num1 + num2;
			System.out.println("sum of two number is = " + sum);
		}
		

	}

}
