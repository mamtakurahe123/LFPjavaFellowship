package fabonacciseries;
import java.util.Scanner;

public class UsingConstructor {
	
	public static void main(String[] args) {
		
				
		FabonacciSeries FS = new FabonacciSeries();
	      FS.FabonacciSeries(20);
				
	}

}


class FabonacciSeries{
	
	public static void FabonacciSeries(int term) {
		
		int num1=0,num2=1, counter=0;
		
		while(counter < term) {
			
			System.out.println(num1+ " ");
			
			int num3= num1+num2;
			 num1 = num2;
			 num2 = num3;
			 counter = counter+1;
			 
			
		}
		
	}
}