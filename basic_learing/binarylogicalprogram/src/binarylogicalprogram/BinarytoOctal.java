package binarylogicalprogram;

import java.util.Scanner;

public class BinarytoOctal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int binnum, binnum1,rem,decnum=0,quot, i=1, j;
		int octnum[] = new int[100];
		System.out.println("Enter Binary Number ");
		binnum = sc.nextInt();
		binnum1=binnum;
		
		while(binnum > 0) {
			rem = binnum % 10;
			decnum = decnum + rem*i;
			i=i*2;
			binnum = binnum/10;
		}
	
	  i=1;
	  quot = decnum;
	  
	  while(j>0) {
		  System.out.println(octnum[j]);
	  }
	}  
	
}
