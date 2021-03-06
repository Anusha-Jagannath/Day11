package com.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Employee implements ComputeInterface {
	// constants
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;
	// variables
	private int empWage;
	private int empHrs;
	private int totalWage = 0;
	private int empCheck;
	private int totalWorkingHrs;
	List<Company> companies;
	// hashmap stores company name and salary
	HashMap<String, Integer> hashmap = new HashMap<>();

	Employee() {
		companies = new ArrayList<>();
	}

	/*
	 * method to add company
	 * 
	 * @param company,wage per hour,no of working days,maxHour
	 */
	public void addCompany(String company, int wagePerHour, int noOfWorkingHours, int maxHourPerMonth) {
		Company company1 = new Company(company, wagePerHour, noOfWorkingHours, maxHourPerMonth);
		companies.add(company1);
	}

	/*
	 * method to to call wageForCompany
	 */
	public void computeEmpWage() {
		for (Company company : companies)
			wageForCompany(company);
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
			System.out.println("Daily wage for company " + company.getCompany() + " is " + empWage);
			totalWorkingHrs += empHrs;
			totalWage += empWage;
			company.setDailyWage(empWage);
		}
		System.out.println("Total Employee wage for company " + company.getCompany() + " is " + totalWage);
		company.setTotalWage(totalWage);
		hashmap.put(company.getCompany(), totalWage);
	}
	/*
	 * method to find the salary of respective company Hash map is used to store
	 * company name and corresponding salary
	 */

	public void querySalary(String name) {
		System.out.println(hashmap.get(name));
	}

}

public class EmployeeWage {
	public static void main(String[] args) {
		ComputeInterface employee = new Employee();
		employee.addCompany("Jio", 20, 20, 100);
		employee.addCompany("Dmart", 20, 10, 100);
		employee.computeEmpWage();
		System.out.println("Enter the company name to query salary");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		employee.querySalary(name);

	}

}
