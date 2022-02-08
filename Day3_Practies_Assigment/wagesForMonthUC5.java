package wagesForMonthUC5;

public class wagesForMonthUC5 {
	public static final int isfullTime= 1;
	public static final int ispartTime=2;
	public static final int workParHrRate=20;
	public static final int numOfDays=20;
	
	public static void main(String[] args) {
		
		int wages;
		int workPartTime=4;
		int workFullTime=8;
		System.out.println("employee is presnt or apsent");
		    
	for( int day=0; day<=numOfDays; day++) 
	{
		double empcheck = Math.floor(Math.random() * 10) % 3;
		switch((int)empcheck)
			{    
		    //case statements within the switch block  
			    case 1:
			    	  wages= workFullTime*workParHrRate; 
			    	  System.out.println("employee is presnt and wages is " + wages);
			    break;    
			    case 2:
			    	 wages= workPartTime*workParHrRate;
			    	 System.out.println("employee is presnt and wages is " + wages);
			   	 
			    break;    
			    default:System.out.println("employee is apsent");    
		    }    
	   
	}
	   
	}

}
