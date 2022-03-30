package com.belhard.university;

import java.util.Arrays;
import java.util.Objects;

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(teachers);
		result = prime * result + Objects.hash(academicDegre, allowancesForAcademicDerges, id, subject);
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
		Teacher other = (Teacher) obj;
		return Objects.equals(academicDegre, other.academicDegre)
				&& Double.doubleToLongBits(allowancesForAcademicDerges) == Double
						.doubleToLongBits(other.allowancesForAcademicDerges)
				&& id == other.id && Objects.equals(subject, other.subject) && Arrays.equals(teachers, other.teachers);
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

	@Override
	public int idNum() {
		// TODO Auto-generated method stub
		return 0;
	}
}
