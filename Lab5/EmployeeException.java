package lab5;

public class EmployeeException {
	if(sal < 3000) {
		InvalidSalaryException invalid = new InvalidSalaryException("Insufficient Salary");
		throw(invalid);
	}else {
		ValidSalaryException valid = new ValidSalaryException("Enough Balance");
		throw valid;
	
	}
}
