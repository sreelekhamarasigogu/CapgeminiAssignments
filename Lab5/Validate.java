package lab5;

public class Validate {
	public void checkAge(int age) throws ValidAgeException, InvalidAgeException{
		if(age < 15) {
			InvalidAgeException invalid = new InvalidAgeException("INVALID AGE");
			throw(invalid);
		}else {
			ValidAgeException valid = new ValidAgeException("Valid Age");
			throw valid;
		}
	}




}
