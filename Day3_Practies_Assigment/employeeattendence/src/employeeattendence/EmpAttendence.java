package employeeattendence;

public class EmpAttendence {
	public static void main(String[] args) {
		int isPresent=1;
		System.out.println("employee is presnt or apsent");
		double checkEmp=(int)(Math.random()*10)%2;
		if (isPresent==checkEmp) {
			System.out.println("Employee is Present");
		}else {
			System.out.println("Employee is Apsent");
		}
	}

}
