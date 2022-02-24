package binarylogicalprogram;

import java.util.Scanner;

public class OctalNumtoBinaryNum {
	
	public static void main(String[] args) {
		
		int octal_numValue[] = {0,1,10,11,100,101,110,111};
		
		long oct_num, temp_octal_num, binNumber, place;
		
		int reminder;
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Input any Octal Number");
			
			oct_num = sc.nextLong();
			
			temp_octal_num = oct_num;
			
			binNumber=0;
			
			place=1;
			
		}
		while(temp_octal_num !=0) {
			
			reminder = (int)(temp_octal_num % 10);
			binNumber = octal_numValue[reminder]*place + binNumber;
			temp_octal_num /= 10;
			place*=1000;
			
			
		}
		
		System.out.println("Equivalent biner Number " + binNumber);
		
	
		
	}
	

}
