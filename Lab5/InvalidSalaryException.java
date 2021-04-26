package lab5;

@SuppressWarnings("serial")
public class InvalidSalaryException extends Exception{
	public InvalidSalaryException(String sal) {
		super(sal);

	}

}
