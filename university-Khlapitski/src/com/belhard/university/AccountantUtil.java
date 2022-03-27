package com.belhard.university;

import java.util.Arrays;

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
		return "AccountantUtil [firstName=" + firstName + ", lastName=" + lastName + ", getNumber()=" + getNumber()
				+ ", depList()=" + depList() + ", toString()=" + super.toString() + ", introduceYourself()="
				+ introduceYourself() + ", getExperience()=" + getExperience() + ", getHoursWorked()="
				+ getHoursWorked() + ", getSalary()=" + getSalary() + ", getVacation()=" + getVacation()
				+ ", getStructuralDivivsion()=" + getStructuralDivivsion() + ", getYearsOfExperience()="
				+ getYearsOfExperience() + ", getVacationPay()=" + getVacationPay() + ", getPrize()=" + getPrize()
				+ ", getSalaryFix()=" + getSalaryFix() + ", getDegreeAllowance()=" + getDegreeAllowance()
				+ ", getTechers()=" + Arrays.toString(getTechers()) + ", getId()=" + getId() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getDateOfBirth()=" + getDateOfBirth()
				+ ", getAddress()=" + getAddress() + ", getPhoneNumber()=" + getPhoneNumber() + ", getEmail()="
				+ getEmail() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}