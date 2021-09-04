package com.employee;

public interface ComputeInterface {
	public void addCompany(String company, int wagePerHour, int noOfWorkingHours, int maxHourPerMonth);
	public void computeEmpWage();
	public void wageForCompany(Company company);
	public void querySalary(String name);

}
