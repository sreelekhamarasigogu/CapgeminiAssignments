package lab5;

import java.util.Scanner;

public class Test {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws ValidateSalaryException, InvalidSalaryException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double sal = sc.nextDouble();
		EmployeeException v = new EmployeeException();
		v.checkSalary(sal);
	}

}
