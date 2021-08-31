package com.employee;

public class EmployeeWage {
	final static int IS_FULL_TIME = 2;
	final static int IS_PART_TIME = 1;
	final static int WAGE_PER_HOUR = 20;
	final static int NO_OF_DAYS = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage computation");
		// constants
		int empWage = 0;
		int empHrs = 0;
		int totalWage = 0;
		for (int days = 0; days < NO_OF_DAYS; days++) {
			// computation
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case 2:
				empHrs = 8;
				break;
			case 1:
				empHrs = 4;
				break;
			default:
				empHrs = 0;

			}
			empWage = empHrs * WAGE_PER_HOUR;
			totalWage += empWage;
		}

		System.out.println("Total Employee wage is " + totalWage);

	}
}
