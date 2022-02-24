package binarylogicalprogram;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		   
		int dec_num, rem, quot, i=1,j;
		int bin_num[] = new int[100];
				   
	    Scanner in = new Scanner(System.in);
		   
		   System.out.print("Input Decimal Number:");
		   dec_num = in.nextInt();
		   quot = dec_num;
		   
		  	   
		   while(quot !=0) {
			   
			   bin_num[i++] = quot%2;
			   quot = quot/2;
		   }
		   System.out.println("Binary number is:");
		   
		  for( j=i-1; j>0; j--){
			  
		       
		    	   System.out.println(bin_num[j]);
		  }
		       System.out.print("\n");
		   
	   }
		
}
