package com.employee;

public class EmployeeWage {
	final static int IS_PRESENT = 1;
	final static int WAGE_PER_HOUR=20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage computation");
		// constants
		int empWage=0;
		int empHrs=0;
		
		// computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_PRESENT) {
			empHrs = 8;
			System.out.println("The Employee is present");
		}
		else 
			System.out.println("The Employee is absent");
		empWage = empHrs * WAGE_PER_HOUR;
		System.out.println("Employee wage is "+empWage);
		
	}
}
