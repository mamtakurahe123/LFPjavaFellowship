package funcationalprogramm;
import java.util.*;

public class callbyvalueandcallbyrefrence {
	
	int change(int b) 
	  { 
	    ++b; // Changes will be in the local variable only. 
	    return b; 
	  } 
	public static void main(String[] args) 
	{ 
	// Create an object of class. 
		callbyvalueandcallbyrefrence obj = new callbyvalueandcallbyrefrence(); 
	     int a = 20; 
	     int x = obj.change(a); 
	     System.out.println("Value of a after passing: " +a); 
	     System.out.println("Value of x after modifying: " +x); 
	 } 

}
