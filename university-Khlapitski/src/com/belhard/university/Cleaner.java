package com.belhard.university;

public class Cleaner extends Employee {
	Cleaner cleaner;
	private static long counter = 1;
	private long id;
	private int cleaningCabinet;

	public Cleaner(String firstName, String lastName) {
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
