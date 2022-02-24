package dataytypes;
import java.util.Scanner;

public class AddsDigits0to1000 {
	
	public static void main(String[] agrs) {
		
		int number, remainder ,firstDigit, secondDigit, threedDigit,fourthDigit;
		
		try(Scanner input = new Scanner(System.in)) {
			
			System.out.println("Enter any number between 0 t0 1000");
			 number = input.nextInt();
			
		}
		 firstDigit = number % 10;
		 remainder =  number/10;
		
		 secondDigit = remainder % 10;
		 remainder =  number/10;
		
		 threedDigit = remainder % 10;
		 remainder =  number/10;
		 
		 fourthDigit = remainder % 10;
	
		 AddsDigits0to1000 add = new AddsDigits0to1000();
		 add.addDigit(firstDigit, secondDigit, threedDigit,fourthDigit);
		
		 System.out.println("addtion of three digit is ");
	}
	
	public static void addDigit(int firstDigit, int secondDigit, int threedDigit,int fourthDigit) {
		
		int sumofThreeDigit = firstDigit + secondDigit + threedDigit + fourthDigit;
		
		 System.out.println(sumofThreeDigit);
	}
}

