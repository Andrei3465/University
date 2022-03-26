package com.belhard.university;

public class AccountantUtil {

	public static double vacationPay(Employee empl) {
		double vacationPay = empl.getSalaryFix() * 2.5;
		return vacationPay;
	}

	public static double prize(Employee empl) {
		double prize = empl.getSalaryFix() * 0.3;
		return prize;
	}

	public static double degreeAllowance(Employee empl) {
		double degreeAllowance = empl.getSalaryFix() * 0.2;
		return degreeAllowance;
	}

	public static double salary(Employee empl) {
		double salary = empl.getSalaryFix() + empl.getPrize() + empl.getDegreeAllowance();
		return salary;
	}

	public static double salaryCleaner(Employee empl) {
		double salary = empl.getSalaryFix() + empl.getPrize();
		return salary;
	}
}