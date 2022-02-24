package practiesproblemday6;
import java.util.Scanner;
public class ReversANumber {
	
	public static int num, remainder, revers=0;
	
	public static void main(String[] args) {
		
		
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter any Number of Revers Opretion");
		
		num=sc.nextInt();
		
		for (;num != 0; num=num/10) {
			
			 remainder = num%10;
			
		     revers = revers * 10 + remainder;
		     
		 }
		System.out.println("Revser Number is shown Below\n " + revers);
		
		
		
	}

}
