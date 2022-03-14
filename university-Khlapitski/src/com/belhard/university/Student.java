package com.belhard.university;


public class Student {
	private int yearOfStudy;
	private boolean isBudget;
	private boolean academicPerformance;

	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public boolean isBudget() {
		return isBudget;
	}

	public void setBudget(boolean isBudget) {
		this.isBudget = isBudget;
	}

	public boolean isAcademicPerformance() {
		return academicPerformance;
	}

	public void setAcademicPerformance(boolean academicPerformance) {
		this.academicPerformance = academicPerformance;
	}

	@Override
	public String toString() {
		return "Student [yearOfStudy=" + yearOfStudy + ", isBudget=" + isBudget + ", academicPerformance="
				+ academicPerformance + ", getYearOfStudy()=" + getYearOfStudy() + ", isBudget()=" + isBudget()
				+ ", isAcademicPerformance()=" + isAcademicPerformance() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
