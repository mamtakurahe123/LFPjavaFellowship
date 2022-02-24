package practiesproblemday6;
import java.util.Scanner;

public class PerfactNumber {
	
	public static void main(String[] args) {
		
		Display ds =  new Display();
		
		long number, s;  
		
		Scanner sc=new Scanner(System.in);         
		System.out.print("Enter the number: ");  
		//reads a number from the user  
		number=sc.nextLong();  
		
		//calling the function  
		s = ds.isPerfect(number); 
		
		//compares sum with the number  
		
		if(s==number)  
		System.out.println(number+ " \n is a perfect number\n");  
		else  
		System.out.println(number+  "\n is not a perfect number");   
		}   
	
}

class Display{
	
	public static long isPerfect(long num) {
		
		long sum=0; 
		
		for(int i = 1; i<=num/2; i++) {
			
			if(num % i== 0) {
				
				sum = sum+i;
			}
		}
		
		return sum;
	}
}
