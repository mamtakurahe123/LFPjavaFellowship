package linecomperision;
import java.util.Scanner;

public class linercomperisionUC1 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
        double x1,x2,y1,y2;
        int distance;
        
        System.out.println("enter x1 & y1 values of first point");
        x1=scanner.nextDouble();
        y1=scanner.nextDouble();
        
        System.out.println("enter x2 & y2 values of second point");
        x2=scanner.nextDouble();
        y2=scanner.nextDouble();
        
        distance=(int)Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Distance between two points = "+distance);
	}

}

