package binarylogicalprogram;
import java.util.Scanner;

public class BinarytoDecimal {

	
	public static void main(String[] agrs) {
		
		long binNumber, decNumber = 0, j = 1, remainder;
		
		try (Scanner sc = new Scanner(System.in)) {
			
			
			binNumber = sc.nextLong();
			
			while(binNumber != 0) {
				
				remainder = binNumber % 10;
				decNumber = decNumber + remainder * j;
				
				j = j * 2;
				
				binNumber = binNumber/10;
			}
		}
		
		System.out.println("Decimal Number:" + decNumber);
		
	}
}
