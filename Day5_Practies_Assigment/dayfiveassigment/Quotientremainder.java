package dayfiveassigment;
import java.util.Scanner;

public class Quotientremainder {

	public static void main(String[] args) {
		
		int dividend, divisor;

		Scanner sc = new Scanner(System.in);
		
		//taking command line input as dividend
		System.out.println("Enter dividend Number");
		dividend = sc.nextInt();
		
		//taking command line input as divisor
		System.out.println("Enter divisor Number");
		divisor = sc.nextInt();
		
		//calculating quotient and remainder 
	    int quotient = dividend / divisor;
	    int remainder = dividend % divisor;

	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);
		
	}
	
}
