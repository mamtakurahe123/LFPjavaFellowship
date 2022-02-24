
/// Write a Java program to convert temperature from Fahrenheit to Celsius degree
package dataytypes;

import java.util.Scanner;

public class FahrenheittoCelsiusdegree {
	
	public static void main(String[] args) {
		
		Celsiuscalculation cf = new Celsiuscalculation();
		 cf.Celsiuscalculation();
		}
}
//constructor
class Celsiuscalculation {
	
  public void Celsiuscalculation() {
		// TODO Auto-generated method stub
		
		double f;
		System.out.println("Enter Feahrenheit value and Celsius value");
		
		try (Scanner sc = new Scanner (System.in)) {
			
			 f = sc.nextDouble();
		}
		
		//°C = (°F - 32) × 5/9
	    double c = (f-32)*5/9;
	     
	     //result
	     System.out.println("vlaue of celsius is  " +c);
		
	}
	
	
}
