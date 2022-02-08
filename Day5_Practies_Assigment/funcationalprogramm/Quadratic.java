package funcationalprogramm;
import java.util.Scanner;

public class Quadratic {
	
	public static void main(String[]  args) {
		 
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter value of a variable");
		a= sc.nextInt();
		
		System.out.println("Enter value of b variable");
		b= sc.nextInt();
		
		System.out.println("Enter value of c variable");
		c= sc.nextInt();
		 
	}
	public static void claculateRoot(int a, int b, int c) {
		
		if(a==0 || b==0 || c==0) {
			
			System.out.println("Quadratic equation need some value plz enter valid number");
		}
		
		int d = b*b - 4*a*c;
		
		//double sqrtValue= sqrt(abs(d));
	}

}
