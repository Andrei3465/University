package com.belhard.university;


public class Teacher {

	private String subject;
	private String academicDegre;
	private double allowancesForAcademicDerges;
	
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

	@Override
	public String toString() {
		return "Teacher [subject=" + subject + ", academicDegre=" + academicDegre + ", getSubject()=" + getSubject()
				+ ", getAcademicDegre()=" + getAcademicDegre() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public double getAllowancesForAcademicDerges() {
		return allowancesForAcademicDerges;
	}

	public void setAllowancesForAcademicDerges(double allowancesForAcademicDerges) {
		this.allowancesForAcademicDerges = allowancesForAcademicDerges;
	}

}
