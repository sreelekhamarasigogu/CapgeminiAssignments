package lab4.task2;

public class EmpService extends Employee implements Service{
	@Override
	public void getEmployeeDetails() {
		System.out.println("Enters into the get employee details");
		displayEmpDetails();
		
	}

	@Override
	public void findInsuranceschema(double salary) {
		// TODO Auto-generated method stub
		if(salary < 50000 ) {
			System.out.println("Eligible for Life Insurance");
		}else if(salary >= 50000 && salary < 75000) {
			System.out.println("Eligible for Life Insurance and Motor Insurance");
		}else {
			System.out.println("Eligible for all insurances");
		}
	}

	@Override
	public void displayEmpDetails() {
		// TODO Auto-generated method stub
		System.out.println("Employee Id: "+getId());
		System.out.println("Employee name: "+getName());
		System.out.println("Employee Salary: "+getSalary());
		System.out.println("Employee Deignation: "+getDesignation());
		
	}
}
