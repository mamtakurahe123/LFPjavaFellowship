package generics;
import java.util.Scanner;
import java.lang.Float;

public class CompareFloatUC2 {
	
	private Float x,y,z;
	
	public CompareFloatUC2(Float x, Float y, Float z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public  Float testMaximum() {
		Float max=x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		else if(z.compareTo(max)>0) {
			max=z;
		}
		return max;
	}
	
	
	public static void main(String[] args) { 
		CompareFloatUC2 CIU= new CompareFloatUC2(9.2f,3.4f,7.6f);
		CIU.testMaximum();
		System.out.println("Maximum Number is :"+CIU.testMaximum());
		
	}

}
