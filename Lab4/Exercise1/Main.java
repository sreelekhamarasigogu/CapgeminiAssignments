package lab4.task1;

import java.util.Scanner;

public class Main {
	static Account a[]=new Account[1000];
	static Scanner sc=new Scanner(System.in);
	static int index=0;
	public static void main(String[] args) {
		Main acc=new Main();
		while(true) {
			System.out.println("Choose one: \n1. Create Account\n2. Withdrawl\n3. Deposit");
			int option=Integer.parseInt(sc.nextLine());
			switch(option) {
			case 1:
				acc.insertAccount();
				break;
			case 2:
				System.out.println("Enter the amount to withdraw: ");
				double amount=Double.parseDouble(sc.nextLine());
				acc.withdrawl(amount);
				break;
			case 3:
				System.out.println("Enter the amount to deposit: ");
				double amt=Double.parseDouble(sc.nextLine());
				acc.deposit(amt);
				break;
			}
		}

	}
	public void deposit(double amt) {
		// TODO Auto-generated method stub
		for(int i=0;i<index;i++) {
			a[i].deposit(amt);
			display(a[i]);
		}
		
	}
	public void withdrawl(double amount) {
		// TODO Auto-generated method stub
		for(int i=0;i<index;i++) {
			a[i].withdrawl(amount);
			display(a[i]);
		}
		
	}
	private void display(Account account) {
		// TODO Auto-generated method stub
		System.out.println("The account number is: "+account.getAccNum());
		System.out.println("The account holder name is: "+account.getAccHolder());
		System.out.println("The account holder age is: "+account.getAccHolder().getAge());
		System.out.println("Account Balance is: "+account.getBalance());
		
	}
	public void insertAccount() {
		System.out.println("Enter the account holder name: ");
		String name=sc.nextLine();
		System.out.println("Enter the account holder age: ");
		float age=Float.parseFloat(sc.nextLine());
		Person p=new Person(name,age);
		Account acc=new Account(p);
		System.out.println("Enter the initial balance");
		double bal=Double.parseDouble(sc.nextLine());
		acc.setBalance(bal);
		addAccount(acc);
		
	}
	public void addAccount(Account acc) {
		a[index++]=acc;
		
	} 

}
