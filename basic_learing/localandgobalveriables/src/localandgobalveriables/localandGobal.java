package localandgobalveriables;
import java.util.Scanner;

public class localandGobal {
	
	public static int a,b;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter value of a");
		 a=in.nextInt();
		 
		 System.out.println("Enter value of b");
		 b=in.nextInt();
		 
		 add(a, b);
		 sub(a, b);
		 multipication(a, b);
		 dividation(a, b);
		
	}
	
	public static void add(int a, int b) {
		int c=0;
		
	    c=a+b;
	    System.out.println("addition of two number is \n" +c);
	    	
	}
	public static void sub(int a, int b) {
		int d=0;
		
	    d=a-b;
	    System.out.println("sub of two number is \n" +d);
	    
		
	}
	public static void multipication(int a, int b) {
		int e=0;
		
	    e=a*b;
	    System.out.println("multipication of two number is \n" +e);
	    
	}
	public static void dividation(int a, int b) {
		int f=0;
		
	    f=a/b;
	    System.out.println("divition of two number is \n" +f);
	    
	}

}
