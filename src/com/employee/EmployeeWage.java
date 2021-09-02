package com.employee;

import java.util.Scanner;

class Employee {
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;
	
	private final String company;
	private final int wagePerHour;
	private int empWage;
	private int empHrs;
	private final int noOfWorkingDays;
	private int totalWage;
	private int empCheck;
	private final int maxHrs;
	private int totalWorkingHrs;

	Employee(String company,int wagePerHour,int noOfWorkingDays,int maxHrs) {
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxHrs = maxHrs;
	}		

	public void wageForCompany() {
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
		System.out.println("Total Employee wage for company "+company+" is " + totalWage);
	}

}

public class EmployeeWage {
	public static void main(String[] args) {
<<<<<<< HEAD
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
=======
		String company;
		int wagePerHour, noOfWorkingDays, maxHrs;
		System.out.println("Welcome to Employee Wage Computation program");
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Enter the company name");
		company = scanner2.nextLine();
		System.out.println("Enter wage per hour for the company");
		wagePerHour = scanner2.nextInt();
		
		System.out.println("Enter no of working days");
		noOfWorkingDays = scanner1.nextInt();
		
		System.out.println("Enter working hours");
		maxHrs = scanner1.nextInt();
		Employee employee = new Employee(company,wagePerHour,noOfWorkingDays,maxHrs);
		employee.wageForCompany();
>>>>>>> uc8_multiple_company_wage
		
	}
	
}
