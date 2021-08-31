package com.employee;

public class EmployeeWage {
	final static int IS_FULL_TIME = 2;
	final static int IS_PART_TIME = 1;
	final static int WAGE_PER_HOUR=20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage computation");
		// constants
		int empWage=0;
		int empHrs=0;
		
		// computation
		double empCheck = Math.floor(Math.random() * 10) % 3;
		System.out.println(empCheck);
		if (empCheck == IS_FULL_TIME) {
			empHrs = 8;
			System.out.println("The Employee is full time");
		}
		else if(empCheck == IS_PART_TIME)
		{
			empHrs = 4;
			System.out.println("The Employee is part time");
		}
		else
			System.out.println("Employee is absent");
		empWage = empHrs * WAGE_PER_HOUR;
		System.out.println("Employee wage is "+empWage);
		
	}
}
