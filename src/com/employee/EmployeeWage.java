package com.employee;

public class EmployeeWage {
	final static int IS_FULL_TIME = 2;
	final static int IS_PART_TIME = 1;
	final static int WAGE_PER_HOUR = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage computation");
		// constants
		int empWage = 0;
		int empHrs = 0;

		// computation
		int empCheck = (int)Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
		case 2: empHrs = 8;
				System.out.println("Employee is full time");
				break;
		case 1: empHrs = 4;
				System.out.println("Employee is part time");
				break;
		default: empHrs = 0;
				System.out.println("Employee is absent");

		}
		empWage = empHrs * WAGE_PER_HOUR;
		System.out.println("Employee wage is " + empWage);

	}
}
