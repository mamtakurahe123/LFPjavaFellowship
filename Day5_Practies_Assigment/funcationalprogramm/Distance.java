package funcationalprogramm;
import java.util.Scanner;

public class Distance {
	
	public static void main(String[] agrs) {
	
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter First Point ");
			int x1= sc.nextInt();
			
			System.out.println("Enter Second Point ");
			int x2= sc.nextInt();
			
			System.out.println("Enter Threed Point ");
			int y1= sc.nextInt();
			
			System.out.println("Enter Four Point ");
			int y2= sc.nextInt();
			
			int distance = calculateDistance(x1, x2, y1, y2);
			System.out.println("Distance of two point " + distance);
			
		}
		
	   
   }
   
   public static int calculateDistance(int x1, int x2, int y1,int y2) {
	   
	   int result = (int)Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
	return result;
	   
   }
}
