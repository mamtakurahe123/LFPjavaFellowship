package basicjavaprogram;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int temp, a,b;
		Scanner in = new Scanner(System.in);
		 
		System.out.println("Enter first number");
		a=in.nextInt();
		
		System.out.println("Enter Second Number");
		b=in.nextInt();
		
		System.out.println("Before Swapping number " + a +"," + +b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping number " + a +"," + +b);
		
	}
}
