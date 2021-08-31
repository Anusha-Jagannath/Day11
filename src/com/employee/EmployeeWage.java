package com.employee;

class Employee {
	private int isFullTime;
	private int isPartTime;
	private int wagePerHour;
	private int empWage;
	private int empHrs;
	private int noOfWorkingDays;
	private int totalWage;
	private static int empCheck;
	private int maxHrs;
	
	private int totalWorkingHrs;

	Employee() {
		isFullTime = 2;
		isPartTime = 1;
		wagePerHour = 20;
		noOfWorkingDays = 20;
		maxHrs = 10;
		empWage = 0;
		empHrs = 0;
		totalWage = 0;
		totalWorkingHrs = 0;
	}

	public void isPresent() {
		int totalWorkingDays = 0;
		while(totalWorkingDays < noOfWorkingDays && totalWorkingHrs <= maxHrs ) {
			totalWorkingDays++;
			empCheck = (int) Math.floor(Math.random() * 10 % 3);
			switch (empCheck) {
			case 2: empHrs = 8;
					break;
			case 1: empHrs = 4;
					break;
			default: empHrs = 0;

			}
			empWage = empHrs * wagePerHour;
			totalWorkingHrs += empHrs;
			totalWage += empWage;
		}
		System.out.println("Total Employee wage " + totalWage);
	}

}

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation program");
		Employee employee = new Employee();
		employee.isPresent();
	}
	
}