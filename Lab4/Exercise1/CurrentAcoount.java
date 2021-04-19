package lab4.task1;

public class CurrentAcoount extends Account{
	private double overDraftLimit;
	public CurrentAcoount(){
		super();
	}
	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit=overDraftLimit;
	}
	public double getOverDraftLimit() {
		return overDraftLimit;
	}
	public void WithDraw(double amount) {
		if((super.getBalance()+amount)>overDraftLimit)
			System.out.println("Draft limit is exceeded");
	}
}
