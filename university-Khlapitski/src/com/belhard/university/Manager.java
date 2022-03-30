package com.belhard.university;

import java.util.Arrays;
import java.util.Objects;

public class Manager extends Employee {
	Manager[] manager;

	private static long counter = 1;
	private long id;
	private String subject;
	
	public Manager(String firstName, String lastName) {
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(manager);
		result = prime * result + Objects.hash(id, subject);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		return id == other.id && Arrays.equals(manager, other.manager) && Objects.equals(subject, other.subject);
	}

	@Override
	public String toString() {
		return "Manager [manager=" + Arrays.toString(manager) + ", id=" + id + ", subject=" + subject + ", firstName="
				+ firstName + ", lastName=" + lastName + ", getId()=" + getId() + ", introduceYourself()="
				+ introduceYourself() + ", getSubject()=" + getSubject() + ", hashCode()=" + hashCode()
				+ ", getExperience()=" + getExperience() + ", getHoursWorked()=" + getHoursWorked() + ", getSalary()="
				+ getSalary() + ", getVacation()=" + getVacation() + ", getStructuralDivivsion()="
				+ getStructuralDivivsion() + ", getYearsOfExperience()=" + getYearsOfExperience()
				+ ", getVacationPay()=" + getVacationPay() + ", getPrize()=" + getPrize() + ", getSalaryFix()="
				+ getSalaryFix() + ", getDegreeAllowance()=" + getDegreeAllowance() + ", getTechers()="
				+ Arrays.toString(getTechers()) + ", toString()=" + super.toString() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getDateOfBirth()=" + getDateOfBirth()
				+ ", getAddress()=" + getAddress() + ", getPhoneNumber()=" + getPhoneNumber() + ", getEmail()="
				+ getEmail() + ", getClass()=" + getClass() + "]";
	}

	@Override
	public int idNum() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
