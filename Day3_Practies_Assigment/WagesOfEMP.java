package empwages;

public class WagesOfEMP {
	public static void main(String[] arg)
	   {
	    int isfulltime = 1;
	    int wageperhour = 20;
	    int fulldayhour = 8;
	    double empcheck = Math.floor(Math.random() * 10) % 2;
	    if (empcheck == isfulltime)
	    {
	       int totalsalary = (wageperhour * fulldayhour);
	       System.out.println("Total Salary is" + totalsalary);
	    }
	    else
	    {
	       System.out.println("Salary is 0");
	    }

	   }

}
