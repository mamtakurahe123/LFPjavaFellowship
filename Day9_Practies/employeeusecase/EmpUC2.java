package employeeusecase;
import java.util.Scanner;

public class EmpUC2 {
	
	public static int fullTime=2, partTime=1, workPartTime, workFullTime, workParHrRate,notWork;
	public static double checkEmp;
	
	public static void random() {
		 checkEmp=(int) Math.floor(Math.random() * 10) % 3;
		 
	}

	public static void main(String[] args) {
			
		 random();
		//System.out.println("j" + random()+ "h");
		 
		if (partTime == checkEmp) {   
			        partTimeWages( workPartTime, workParHrRate);
						
		}else if (fullTime == checkEmp){
			
			fullTimeWages(workFullTime, workParHrRate);
		}else {
			noPresent(notWork, workParHrRate);
		}

    }
	
	public static void partTimeWages(int workPartTime, int workParHrRate) {
		
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter value of PartTime employee has done");
		workPartTime =  input.nextInt();
		
		System.out.println("Enter value of employee has done work as rate per hours ");
		workParHrRate =  input.nextInt();
		
		int wages= workPartTime*workParHrRate;
		System.out.println("employee work part time  and wages is " + wages);
		
	}
    public static void fullTimeWages(int workFullTime, int workParHrRate) {
		
    	 Scanner input = new Scanner(System.in);
 		
 		System.out.println("Enter value of full time employee has done");
 		workFullTime =  input.nextInt();
 		
 		System.out.println("Enter value of employee has done work as rate per hours ");
 		workParHrRate =  input.nextInt();
 		
    	int wages= workFullTime*workParHrRate;
    	System.out.println("employee is presnt full time and wages is " + wages);	
	}
    public static void noPresent(int notWork, int workParHrRate) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Enter value of employee has done work as rate per hours ");
  		workParHrRate =  input.nextInt();
  		
  		notWork = 0;
  		
    	int wages= notWork*workParHrRate;
    	System.out.println("employee is presnt and wages is " + wages);	
	}
	
}


