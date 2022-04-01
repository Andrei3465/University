package com.belhard.university;

public class AccountantUtil extends Departament {

	public static double vacationPay(Employee empl) {
		return empl.getSalaryFix() * 2.5;
	}

	public static double prize(Employee empl) {
		return empl.getSalaryFix() * 0.3;
	}

	public static double degreeAllowance(Employee empl) {
		return empl.getSalaryFix() * 0.2;
	}

	public static double salary(Employee empl) {
		return empl.getSalaryFix() + empl.getPrize() + empl.getDegreeAllowance();
	}

	public static double salaryCleaner(Employee empl) {
		return empl.getSalaryFix() + empl.getPrize();
	}

	@Override
	public String toString() {
		return "AccountantUtil [getNumber()=" + getNumber() + ", depList()=" + depList() + ", toString()="
				+ super.toString() + ", introduceYourself()=" + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}