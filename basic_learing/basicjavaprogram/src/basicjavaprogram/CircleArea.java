package basicjavaprogram;
import java.util.Scanner;

public class CircleArea {
	 public static void main(String args[])
     {

             Scanner in = new Scanner(System.in);

             System.out.println("Enter the radius of circle");
             int radius = in.nextInt();

             System.out.println("Area of Circle is pi*r*r");
             int area= 22/7*radius*radius;

                     System.out.println("area is " + area);

             System.out.println("Perimeter of circle is 2*pi*r ");
             int perimeter=2*22/7*radius;

                     System.out.println("perimeter of circle is " + perimeter);
     }


}
