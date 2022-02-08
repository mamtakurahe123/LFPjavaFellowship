package dayfiveassigment;
import java.util.Scanner;

public class harmonicseries {

	public static int num, i=0;
	public static double series,result;
	
	public static void main(String[] args) {
		
		try(Scanner in = new Scanner(System.in)){
		
			  System.out.println("Enter input number for harmonic series generation");
			  num = in.nextInt();
				
		}
		
		
		for(i=1;i<=num;i++)
		{
			series=series+(1/i);
			
				if(i==1)
					System.out.print("1 + ");
				else if(i==num)
					System.out.print("1/"+i);
				else
					System.out.print("1/"+i+" ");
		}
	    
		while(num > 0) {
			
			  result = result + (double)1/i;
			  num--;
		}
				
		System.out.println("\n THE SUM OF THIS SERIES IS:="+result);
		
	}
}
