package bridgelab;

import java.util.Random;


public class EmpPayrollService {
	
	public static void main (String args []) {
		
		System.out.println("Welcome to employee payroll service");
		
		//UC1=> Check emp is present or not
		//Branch => empCheck_UC1
		
		//UC2 calculate daily emplyee wage
		// WagePerHrs = 20 FulldayHrs=8
		Random random = new Random();
		int empCheck = random.nextInt(2);
		int WagePerHrs = 20;
		int FullDayHrs = 8;
		if(empCheck==0) {
			System.out.println("Employee is Absent");
		}else {
			System.out.println("Employee is Present");
			int dailyWage = WagePerHrs*FullDayHrs;
			System.out.println("Employee Daily Wage is "+dailyWage);
		}
	}	
}
