package bridgelab;

import java.util.Random;


public class EmpPayrollService {
	
	public static void main (String args []) {
		
		System.out.println("Welcome to employee payroll service");
		
		//UC1=> Check emp is present or not
		//Branch => empCheck_UC1
		
		//UC2 calculate daily emplyee wage
		// WagePerHrs = 20 FulldayHrs=8 PartTimeHrs =4;
		Random random = new Random();
		int empCheck = random.nextInt(3);//0,1,2
		int WagePerHrs = 20;
		int FullDayHrs = 8;
		int PartTimeHrs =4;
		
		if(empCheck==0) {
			System.out.println("Employee is Absent");
		// UC_3 Part Time	
		}else if(empCheck==1) {			
			System.out.println("Employee is Present but part time");
			int dailyWage = WagePerHrs*PartTimeHrs;
			System.out.println("Employee Daily Wage is "+dailyWage);		
		}
		else {
			System.out.println("Employee is Present");
			int dailyWage = WagePerHrs*FullDayHrs;
			System.out.println("Employee Daily Wage is "+dailyWage);
		}
	}	
}
