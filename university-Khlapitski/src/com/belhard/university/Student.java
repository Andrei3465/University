package com.belhard.university;

public class Student extends Person {
	Student[] student;
	private int yearOfStudy;
	private boolean isBudget;
	private int academicPerformance;

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
	public String toString() {
		return "Student [yearOfStudy=" + yearOfStudy + ", isBudget=" + isBudget + ", academicPerformance="
				+ academicPerformance + ", getYearOfStudy()=" + getYearOfStudy() + ", isBudget()=" + getIsBudget()
				+ ", isAcademicPerformance()=" + getAcademicPerformance() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public String introduceYourself() {
		return "My name is " + student + ", I'am a student of the " + yearOfStudy + ".";
	}

}
