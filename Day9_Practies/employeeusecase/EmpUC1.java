package employeeusecase;
import java.util.Scanner;
import java.util.*;

public class EmpUC1 {
	public static double checkEmp;
	
	public static void random() {
		 checkEmp=(int)(Math.random()*10)%2;
	}
	public static void main(String[] args) {
		
		int isPresent=1;
		
		System.out.println("employee is presnt or apsent");
		
		random();
		
		if (isPresent == checkEmp) {
			System.out.println("Employee is Present");
		}else {
			System.out.println("Employee is Apsent");
		}
	}
		

	
}


		
	



