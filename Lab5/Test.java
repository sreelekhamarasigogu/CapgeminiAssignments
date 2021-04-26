package lab5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double sal = sc.nextDouble();
		EmployeeException v = new EmployeeException();
		v.checkSalary(sal);
	}

}
