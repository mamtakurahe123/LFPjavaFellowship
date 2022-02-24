///Write a Java program that reads a number in inches, converts it to meters

package dataytypes;
import java.util.Scanner;

public class InchtoMetter {
	
	public static void main(String[] args) {
		
		Metter m = new Metter();
		m.metter();
	}

}
//constructor
class Metter {
	
	//argumented non return type constructor 
	public void metter() {
		
		double inch;
		
       try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Enter inch as a input value");
			
			 inch = input.nextDouble();
		}
		
		double met = inch*0.0254;
		
		System.out.println("after change the inch value in Metter\n" +met);
	}
}
