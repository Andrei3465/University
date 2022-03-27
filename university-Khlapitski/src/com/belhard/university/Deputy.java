package com.belhard.university;

import java.util.Arrays;
import java.util.Objects;

public class Deputy extends Employee {

	private static long counter = 1;
	private long id;

	public Deputy(String firstName, String lastName) {
		id = counter++;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public long getId() {
		return id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String introduceYourself() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deputy other = (Deputy) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Deputy [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", getId()=" + getId()
				+ ", introduceYourself()=" + introduceYourself() + ", hashCode()=" + hashCode() + ", getExperience()="
				+ getExperience() + ", getHoursWorked()=" + getHoursWorked() + ", getSalary()=" + getSalary()
				+ ", getVacation()=" + getVacation() + ", getStructuralDivivsion()=" + getStructuralDivivsion()
				+ ", getYearsOfExperience()=" + getYearsOfExperience() + ", getVacationPay()=" + getVacationPay()
				+ ", getPrize()=" + getPrize() + ", getSalaryFix()=" + getSalaryFix() + ", getDegreeAllowance()="
				+ getDegreeAllowance() + ", getTechers()=" + Arrays.toString(getTechers()) + ", toString()="
				+ super.toString() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getDateOfBirth()=" + getDateOfBirth() + ", getAddress()=" + getAddress() + ", getPhoneNumber()="
				+ getPhoneNumber() + ", getEmail()=" + getEmail() + ", getClass()=" + getClass() + "]";
	}
	
}
