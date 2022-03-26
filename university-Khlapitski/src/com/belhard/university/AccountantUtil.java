package com.belhard.university;

public class AccountantUtil {

	public static double vacationPay(double salaryFix) {
		double vacationPay = salaryFix * 2.5;
		return vacationPay;
	}

	public static double prize(double salaryFix) {
		double prize = salaryFix * 0.3;
		return prize;
	}

	public static double degreeAllowance(double salaryFix) {
		double degreeAllowance = salaryFix * 0.2;
		return degreeAllowance;
	}

	public static double salaryTeacher(double salaryFix, double prize, double degreeAllowance) {
		double salary = salaryFix + prize + degreeAllowance;
		return salary;
	}

	public static double salaryManager(double salaryFix, double prize, double degreeAllowance) {
		double salary = salaryFix + prize + degreeAllowance;
		return salary;
	}

	public static double salaryDeputy(double salaryFix, double prize, double degreeAllowance) {
		double salary = salaryFix + prize + degreeAllowance;
		return salary;
	}

	public static double salaryCleaner(double salaryFix, double prize) {
		double salary = salaryFix + prize;
		return salary;
	}
}