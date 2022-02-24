package practiesproblemday6;
import java.util.Scanner;

public class StopwatchProgram {
	
	public long startTimer=0;
	public long stopTimer=0;
	public long elapsed;
	
	//code for start timer
	public void startTimer() {
		startTimer=System.currentTimeMillis();
		System.out.println("Start Time is: " +startTimer);
	}
	
	
	//code for stop timer
	public void stopTimer()
		{
			stopTimer=System.currentTimeMillis();
			System.out.println("Stop Time is: " +stopTimer);
		}
	
	public long getElapsedTime()
	{
		elapsed=stopTimer-startTimer;
		return elapsed;
	}
	
	public static void main(String[] args) throws Exception
	{
		StopwatchProgram sw=new StopwatchProgram();
		Scanner u= new Scanner(System.in);
		System.out.println("Press '1' to Start Time: ");
		u.nextInt();
		sw.startTimer();

		System.out.println();
		System.out.println("Press '2' to Stop Time: ");
		u.nextInt();
		sw.stopTimer();

		long l=sw.getElapsedTime();
		System.out.println();
		System.out.println("Total Time Elapsed(in millisec) is:"+l);
		System.out.println();
		System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
	}
}
