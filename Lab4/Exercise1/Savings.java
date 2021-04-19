package lab4.task1;

public class Savings extends Account{
	private final double minBal=500;
	public Savings(){
		super();
	}
	public void Withdraw(double amount) {
		if((super.getBalance()-amount)>=minBal)
			super.withdrawl(amount);
		else
			System.out.println("Withdrawl can't be done ");
	}

}
