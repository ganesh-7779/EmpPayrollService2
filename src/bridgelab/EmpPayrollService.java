package bridgelab;

import java.util.Random;


public class EmpPayrollService {
	
	public static void main (String args []) {
		
		System.out.println("Welcome to employee payroll service");
		
		//UC1=> Check emp is present or not
		//Branch => empCheck_UC1
		Random random = new Random();
		
		int empCheck = random.nextInt(2);
		
		if(empCheck==0) {
			System.out.println("Employee is Absent");
		}else {
			System.out.println("Employee is Present");
		}
		
		//0 => absent // 1=> present
		
	}
	
}
