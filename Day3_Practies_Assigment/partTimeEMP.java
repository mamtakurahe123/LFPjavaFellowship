package empparttime;

public class partTimeEMP {
	public static void main(String[] args) {
		int fullTime= 1;
		int partTime=2;
		int workPartTime=4;
		int workFullTime=8;
		int workParHrRate=20;
		System.out.println("employee is presnt or apsent");
		double checkEmp = Math.floor(Math.random() * 10) % 2;	
		if (partTime == checkEmp) {   
			int wages= workPartTime*workParHrRate;
			System.out.println("employee is presnt and wages is " + wages);			
		}else if (fullTime == checkEmp){
			int wages= workFullTime*workParHrRate;
			System.out.println("employee is presnt and wages is " + wages);	
		}else {
			System.out.println("employee is apsent");
		}
	}

}
