package com.belhard.university;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(student);
		result = prime * result + Objects.hash(academicPerformance, id, isBudget, yearOfStudy);
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
		Student other = (Student) obj;
		return academicPerformance == other.academicPerformance && id == other.id && isBudget == other.isBudget
				&& Arrays.equals(student, other.student) && yearOfStudy == other.yearOfStudy;
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

	@Override
	public int idNum() {
		// TODO Auto-generated method stub
		return 0;
	}
}
