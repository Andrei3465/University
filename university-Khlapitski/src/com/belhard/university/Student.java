package com.belhard.university;

import java.util.Arrays;

public class Student extends Person {
	Student[] student;
	private static long counter = 1;
	private long id;
	private int yearOfStudy;
	private boolean isBudget;
	private int academicPerformance;

	public Student(String firstName, String lastName) {
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

	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public boolean getIsBudget() {
		return isBudget;
	}

	public void setisBudget(boolean isBudget) {
		this.isBudget = isBudget;
	}

	public int getAcademicPerformance() {
		return academicPerformance;
	}

	public void setAcademicPerformance(int academicPerformance) {
		this.academicPerformance = academicPerformance;
	}

	@Override
	public String introduceYourself() {
		return "My name is " + student + ", I'am a student of the " + yearOfStudy + ".";
	}

	@Override
	public String toString() {
		return "Student [student=" + Arrays.toString(student) + ", id=" + id + ", yearOfStudy=" + yearOfStudy
				+ ", isBudget=" + isBudget + ", academicPerformance=" + academicPerformance + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", getId()=" + getId() + ", getYearOfStudy()=" + getYearOfStudy()
				+ ", getIsBudget()=" + getIsBudget() + ", getAcademicPerformance()=" + getAcademicPerformance()
				+ ", introduceYourself()=" + introduceYourself() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getDateOfBirth()=" + getDateOfBirth() + ", getAddress()="
				+ getAddress() + ", getPhoneNumber()=" + getPhoneNumber() + ", getEmail()=" + getEmail()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}
