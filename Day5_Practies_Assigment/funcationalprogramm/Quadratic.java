package funcationalprogramm;
import java.util.Scanner;

public class Quadratic {
	
	double  a,b,c;
	
	
	public static void main(String[]  args) {
		 
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter value of a variable");
		double a= sc.nextDouble();
		
		System.out.println("Enter value of b variable");
		double b= sc.nextDouble();
		
		System.out.println("Enter value of c variable");
		double c= sc.nextDouble();
		
		// check if determinant is greater than 0
    
		 claculateRoot( a,  b, c);
		
	}
	public static void claculateRoot(double a, double b, double c) {
		double root1, root2;
		if(a==0 || b==0 || c==0) {
			
			System.out.println("Quadratic equation need some value plz enter valid number");
		}
		
		double  delta  = b*b - 4*a*c;
		
		//double sqrtValue= sqrt(abs(d));
			if (delta > 0) {

		  // two real and distinct roots
		  root1 = (-b + Math.sqrt(delta)) / (2 * a);
		  root2 = (-b - Math.sqrt(delta)) / (2 * a);

		  System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
		}// check if determinant is equal to 0
		else if (delta == 0) {

		  // two real and equal roots
		  // determinant is equal to 0
		  // so -b + 0 == -b
		  root1 = root2 = -b / (2 * a);
		  System.out.format("root1 = root2 = %.2f;", root1);
		}

		// if determinant is less than zero
		else {

		  // roots are complex number and distinct
		  double real = -b / (2 * a);
		  double imaginary = Math.sqrt(-delta) / (2 * a);
		  System.out.format("root1 = %.2f+%.2fi", real, imaginary);
		  System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
		}
	}

}
