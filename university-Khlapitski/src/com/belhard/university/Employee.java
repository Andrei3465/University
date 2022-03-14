package com.belhard.university;

public class Employee {

	private int experience;
	private int hoursWorked;
	private double salary;
	private double vacation;
	private String structuralDivivsion;
	private double vacationPay;
	private double prize;
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getVacation() {
		return vacation;
	}
	public void setVacation(double vacation) {
		this.vacation = vacation;
	}
	public String getStructuralDivivsion() {
		return structuralDivivsion;
	}
	public void setStructuralDivivsion(String structuralDivivsion) {
		this.structuralDivivsion = structuralDivivsion;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	private int yearsOfExperience;
	public double getVacationPay() {
		return vacationPay;
	}
	public void setVacationPay(double vacationPay) {
		this.vacationPay = vacationPay;
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	@Override
	public String toString() {
		return "Employee [experience=" + experience + ", hoursWorked=" + hoursWorked + ", salary=" + salary
				+ ", vacation=" + vacation + ", structuralDivivsion=" + structuralDivivsion + ", vacationPay="
				+ vacationPay + ", prize=" + prize + ", yearsOfExperience=" + yearsOfExperience + ", getExperience()="
				+ getExperience() + ", getHoursWorked()=" + getHoursWorked() + ", getSalary()=" + getSalary()
				+ ", getVacation()=" + getVacation() + ", getStructuralDivivsion()=" + getStructuralDivivsion()
				+ ", getYearsOfExperience()=" + getYearsOfExperience() + ", getVacationPay()=" + getVacationPay()
				+ ", getPrize()=" + getPrize() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
