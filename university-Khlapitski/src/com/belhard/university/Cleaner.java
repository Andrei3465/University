package com.belhard.university;

public class Cleaner extends Employee {
	Cleaner cleaner;
	private int cleaningCabinet;

	public int getCleaningCabinet() {
		return cleaningCabinet;
	}

	public void setCleaningCabinet(int cleaningCabinet) {
		this.cleaningCabinet = cleaningCabinet;
	}

	@Override
	public String toString() {
		return "Cleaner [cleaningCabinet=" + cleaningCabinet + ", getCleaningCabinet()=" + getCleaningCabinet()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public String introduceYourself() {
		return "My name is " + cleaner + "I clean the cabinet" + cleaningCabinet + ".";
	}
}
