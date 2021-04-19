package lab4.task1;

public class Account {
	private long AccNum=1;
	private double balance;
	private Person AccHolder;
	public Account() {
		super();
	}
	public Account(Person AccHolder) {
		super();
		this.AccHolder=AccHolder;
	}
	public void setAccHolder(Person AccHolder) {
		this.AccHolder=AccHolder;
	}
	public Person getAccHolder() {
		return AccHolder;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	public long getAccNum() {
		long newAccNum=AccNum;
		AccNum++;
		return newAccNum;
	}
	public void withdrawl(double amount) {
		// TODO Auto-generated method stub
		balance-=amount;
	}
	public void deposit(double amt) {
		// TODO Auto-generated method stub
		balance+=amt;
		
	}
	
}
