package com.employee;

public class Company {
	private String company;
	private int wagePerHour;
	private int noOfWorkingDays;
	private int maxHourPerMonth;
	private int totalWage;
	private int dailyWage;

	public Company(String company, int wagePerHour, int noOfWorkingDays, int maxHourPerMonth) {
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxHourPerMonth = maxHourPerMonth;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getWagePerHour() {
		return wagePerHour;
	}

	public void setWagePerHour(int wagePerHour) {
		this.wagePerHour = wagePerHour;
	}

	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}

	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}

	public int getMaxHourPerMonth() {
		return maxHourPerMonth;
	}

	public void setMaxHourPerMonth(int maxHourPerMonth) {
		this.maxHourPerMonth = maxHourPerMonth;
	}

	public int getTotalWage() {
		return totalWage;
	}

	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}

	public int getDailyWage() {
		return dailyWage;
	}

	public void setDailyWage(int dailyWage) {
		this.dailyWage = dailyWage;
	}

}
