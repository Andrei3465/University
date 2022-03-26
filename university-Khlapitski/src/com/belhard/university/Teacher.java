package com.belhard.university;

import java.util.Arrays;

public class Teacher extends Employee {
	Teacher[] teachers;
	private static long counter = 1;
	private long id;
	private String subject;
	private String academicDegre;
	private double allowancesForAcademicDerges;

	public Teacher(String firstName, String lastName) {
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAcademicDegre() {
		return academicDegre;
	}

	public void setAcademicDegre(String academicDegre) {
		this.academicDegre = academicDegre;
	}

	public double getAllowancesForAcademicDerges() {
		return allowancesForAcademicDerges;
	}

	public void setAllowancesForAcademicDerges(double allowancesForAcademicDerges) {
		this.allowancesForAcademicDerges = allowancesForAcademicDerges;
	}

	@Override
	public String toString() {
		return "Teacher [teachers=" + Arrays.toString(teachers) + ", id=" + id + ", subject=" + subject
				+ ", academicDegre=" + academicDegre + ", allowancesForAcademicDerges=" + allowancesForAcademicDerges
				+ "]";
	}

	@Override
	public String introduceYourself() {
		return "My name is " + teachers + ", I'am a " + subject + "teacher.";
	}
}
