package dayfiveassigment;
import java.util.Scanner;

public class SwapTwoNumber {
	

	
	public static void main(String[] args) {
		//initilized three variables
		int temp, a,b;
		Scanner in = new Scanner(System.in);
		 
		//taking command line argument as first number a
		System.out.println("Enter first number\n");
		a=in.nextInt();
		
		//taking command line argument as Second number b
		System.out.println("Enter Second Number\n");
		b=in.nextInt();
		
		//printing number berore swaping
		System.out.println("Before Swapping number " + a +"," + +b + "\n");
		
		//a value assinged in the temp variable
		temp=a;
		//b value assinged in the a variable
		a=b;
		//temp value assinged in the b variable
		b=temp;
		
		//result printing after swaping variable value
		System.out.println("After Swapping number " + a +"," + +b);
		
	}

}
