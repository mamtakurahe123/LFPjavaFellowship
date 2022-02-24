package fabonacciseries;
import java.util.Scanner;

public class UsingMainMethod {
	
    public static int t1=0,t2=1;

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number inwhic term u want the series");
		int n=sc.nextInt();
		
		System.out.println("Faboncci Series Show below");
		 
		
		 for (int i = 1; i <= n; ++i)
	        {
	            System.out.print(t1 + " ");
	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }
	}

	
}
