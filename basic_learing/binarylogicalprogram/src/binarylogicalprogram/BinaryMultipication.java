package binarylogicalprogram;

import java.util.Scanner;

public class BinaryMultipication {
	public static void main (String args[]) {
		// TODO Auto-generated method stub
		long binarynum1, binarynum2, product=0;
		
		int digit, factor = 1;
				
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter First two digit binary Number");
		 binarynum1 = in.nextLong();
		
		System.out.println("Enter Second two digit binary Number");
		 binarynum2 = in.nextLong();
		 
		 while(binarynum2 != 0) {
			  digit = (int)(binarynum2 % 10);
			  if(digit == 1) {
				  binarynum1 = binarynum1*factor;
				  product = binarymultiper((int) binarynum1, (int) product);
			  }else {
				  binarynum1 = binarynum1*factor;
			  }
			  binarynum2 = binarynum2/10;
			  factor = 10;
		 }
		System.out.print("product of two binary number:" + product + "\n");
	}

static int binarymultiper( int binarynum1, int binarynum2) {
	
	int i = 0, remainder = 0;
	int[] sum = new int[20];
	int binary_prod_result = 0;
	
	while(binarynum1 != 0 || binarynum2 != 0) {
		sum[i++] = (binarynum1 % 10 + binarynum2 % 10 + remainder) % 2;
		remainder = (binarynum1 % 10 + binarynum2 % 10 + remainder)/2;
		binarynum1 = binarynum1/10;
		binarynum2 = binarynum2/10;
	}
	if(remainder != 0) {
		sum[i++]=remainder;
	}
	--i;
	while(i >= 0) {
		binary_prod_result = binary_prod_result * 10 +sum[i--];
	}
	return binary_prod_result;
}

}
