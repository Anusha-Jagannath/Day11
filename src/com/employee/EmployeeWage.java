package com.employee;

import java.util.Arrays;
import java.util.Scanner;

class Employee implements ComputeInterface{
	// constants
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;

	// variables
	private int empWage;
	private int empHrs;
	private int totalWage = 0;
	private int empCheck;
	private int totalWorkingHrs;
	private Company[] companies;
	private int noOfCompany;

	Employee() {
		companies = new Company[5];
	}

	/*
	 * method to add company
	 * 
	 * @param company,wage per hour,no of working days,maxHour
	 */
	public void addCompany(String company, int wagePerHour, int noOfWorkingHours, int maxHourPerMonth) {
		companies[noOfCompany] = new Company(company, wagePerHour, noOfWorkingHours, maxHourPerMonth);
		noOfCompany++;
	}

	/*
	 * method to to call wageForCompany
	 */
	public void computeEmpWage() {
		for (int i = 0; i < noOfCompany; i++) {
			Company company = companies[i];
			wageForCompany(company);
		}
	}

	/*
	 * method to compute wage
	 * 
	 * @param company object
	 */
	public void wageForCompany(Company company) {
		int totalWorkingDays = 0;

		while (totalWorkingDays < company.getNoOfWorkingDays() && totalWorkingHrs <= company.getMaxHourPerMonth()) {
			totalWorkingDays++;
			empCheck = (int) Math.floor(Math.random() * 10 % 3);
			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;

			}
			empWage = empHrs * company.getWagePerHour();
			totalWorkingHrs += empHrs;
			totalWage += empWage;
		}
		System.out.println("Total Employee wage for company " + company.getCompany() + " is " + totalWage);
	}

	@Override
	public String toString() {
		return "Employee [empWage=" + empWage + ", empHrs=" + empHrs + ", totalWage=" + totalWage + ", empCheck="
				+ empCheck + ", totalWorkingHrs=" + totalWorkingHrs + ", companies=" + Arrays.toString(companies)
				+ ", noOfCompany=" + noOfCompany + "]";
	}

	
}

public class EmployeeWage {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.addCompany("Jio", 20, 20, 100);
		employee.addCompany("Dmart", 20, 10, 100);
		employee.computeEmpWage();

	}

}
