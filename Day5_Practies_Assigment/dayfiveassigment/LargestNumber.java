package dayfiveassigment;
import java.util.Scanner;

public class LargestNumber {
	
	public static void main(String[] args) {
		//initilazed variables
		int num1, num2,num3;
		
		Scanner sc = new Scanner(System.in);
		
		//taking first input from command line 
		
		System.out.println("Enter First Number");
		num1=sc.nextInt();
		
		//taking Second input from command line 
		
		System.out.println("Enter Second Number");
		num2=sc.nextInt();
		
		//taking threed input from command line 
		
		System.out.println("Enter Threed Number");
		num3=sc.nextInt();
		//comparing numbers to each other
		if(num1 > num2 &&  num1 > num3) {
			
			System.out.println("First Number is the largest number among two number " + num1);
			
		}else if(num2 > num3) {
			
			System.out.println("Second Number is the largest number among two number " + num2);
			
		}else {
			System.out.println("threed Number is the largest number among two number " + num3);
		}
	}

}
