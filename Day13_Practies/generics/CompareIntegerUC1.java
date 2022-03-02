package generics;
import java.util.Scanner;
import java.lang.Integer;
 

public class CompareIntegerUC1 {
	private Integer x,y,z;
	
	public CompareIntegerUC1(Integer x, Integer y, Integer z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public  Integer testMaximum() {
		Integer max=x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		else if(z.compareTo(max)>0) {
			max=z;
		}
		return max;
	}
	
	
	public static void main(String[] args) { 
		CompareIntegerUC1 CIU=new CompareIntegerUC1(40,20,25);
		CIU.testMaximum();
		System.out.println("Maximum Number is :"+CIU.testMaximum());
		
	}
	
}
