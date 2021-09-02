package com.employee;

import java.util.Scanner;

class Employee {
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;
	public static int wagePerHour;
	public static int empWage;
	public static int empHrs;
	public static int noOfWorkingDays;
	public static int totalWage;
	public static int empCheck;
	public static int maxHrs;
	
	private int totalWorkingHrs;

	Employee(int wagePerHour,int noOfWorkingDays,int maxHrs) {
		this.wagePerHour = wagePerHour;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxHrs = maxHrs;
	}		

	public void computeWage() {
		int totalWorkingDays = 0;
		while(totalWorkingDays < noOfWorkingDays && totalWorkingHrs <= maxHrs ) {
			totalWorkingDays++;
			empCheck = (int) Math.floor(Math.random() * 10 % 3);
			switch (empCheck) {
			case IS_FULL_TIME: empHrs = 8;
					break;
			case IS_PART_TIME: empHrs = 4;
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
		int wagePerHour, noOfWorkingDays, maxHrs;
		System.out.println("Welcome to Employee Wage Computation program");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter wage per hour for the company");
		wagePerHour = scanner.nextInt();
		
		System.out.println("Enter no of working days");
		noOfWorkingDays = scanner.nextInt();
		
		System.out.println("Enter working hours");
		maxHrs = scanner.nextInt();
		Employee employee = new Employee(wagePerHour,noOfWorkingDays,maxHrs);
		employee.computeWage();
		
	}
	
}