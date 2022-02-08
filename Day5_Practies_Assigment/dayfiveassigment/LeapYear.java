package dayfiveassigment;
import java.util.Scanner;

public class LeapYear {
	public static int year;
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			//command line input
			System.out.println("Enter year");
			year = sc.nextInt();
		}
		
		if(year%4==0) {
			
			if(year%100 == 0) {
				
				if(year%400 == 0) {
					
					System.out.println("this year is leap year");
					
				}
				else {
					
				   System.out.println("this year is not leap year");
			    }
			}else {
				
				System.out.println("this year is leap year");
			}
		}else {
			
			System.out.println("this year is not  leap year");
		}
	}

}
