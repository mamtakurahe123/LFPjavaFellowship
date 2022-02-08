package dayfiveassigment;
import java.util.Scanner;

public class OddEvenNumber {
	
	public static void main(String[] args) {
		
		int number;
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter any Number");
			number =sc.nextInt();
		}
		
	    int even = number%2;
	    
	    if(even==0) {
	    	
	    	System.out.println("Entered Number is Even Number");
	    	
	    }else {
	    	
	    	System.out.println("Entered Number is Odd Number");
	    	
	    }
		
		
	}

}
