package com.capg.lab7.service;

import java.util.List;

import com.capg.lab7.beans.Employee;

public interface IEmployeeService {

	public void insertingEmployee(Employee e) throws InvalidSalaryException;
	public List<Employee> getAllEmployees();
	public List<Employee> getAllEmployeesByScheme(String s);
	public boolean removeEmployee(int id); 
}