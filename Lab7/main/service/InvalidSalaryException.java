package com.capg.lab7.service;

public class InvalidSalaryException extends Exception {
	private int Salary;

	public InvalidSalaryException(int Salary) {
		this.Salary = Salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return "Invalid";
	}
	
	

}
