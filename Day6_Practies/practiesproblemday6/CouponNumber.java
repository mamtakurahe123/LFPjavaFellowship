package practiesproblemday6;
import java.util.*;

public class CouponNumber {
	
	// return a random coupon between 0 and n-1
    public static int getCoupon(int n) {
        return (int) (Math.random() * n);
    }

    // return number of cards you collect before obtaining one of each of the n types
    public static int collect(int n) {
        boolean[] isCollected = new boolean[n];  
        int count = 0;                          
        int distinct  = 0;                      

        // repeat until you've collected all n card types
        while (distinct < n) {
            int value = getCoupon(n);           
            count++;                             
            if (!isCollected[value]) {           
                distinct++;
                isCollected[value] = true;
            }
        }
        return count;
    }

    // test client
    public static void main(String[] args) {
       
    	Scanner sc =  new Scanner(System.in);
    	System.out.println("Enter any Number");
    	int n = sc.nextInt();
        int count = collect(n);
        System.out.println(" Coupon Number shown below \n  "+count);
    } 

}
