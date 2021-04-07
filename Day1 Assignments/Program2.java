package practise;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double hra=0.0,da=0.0,tax=0.0;
		System.out.println("Enter base salary:");
		int base_salary=sc.nextInt();
		hra=0.4 * base_salary;
		da=0.6*(base_salary+hra);
		double salary=(base_salary+hra+da)*12;
		if(salary<200000.0)
			tax=salary;
		else if(salary>=200000.0 && salary<=600000.0)
			tax=salary*0.10;
		else if(salary>600000.0)
			tax=salary*0.20;
		System.out.println("Annual Salary is: "+salary);
		System.out.println("Tax is: "+tax);
		System.out.println("Pay is: "+(salary+tax));
		
	}

}
