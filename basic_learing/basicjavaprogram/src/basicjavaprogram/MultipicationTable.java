package basicjavaprogram;

import java.util.Scanner;

public class MultipicationTable {
	public static void main (String args[]) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int num1 = in.nextInt();
		
		for (int i=1; i<=10; i++) {
			int result = num1*i;
			System.out.println("table of number is = " + result);
		}
		
		

	}
}
