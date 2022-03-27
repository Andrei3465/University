package com.belhard.university;

import java.util.Objects;

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
	public int hashCode() {
		return Objects.hash(cleaner, cleaningCabinet, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cleaner other = (Cleaner) obj;
		return Objects.equals(cleaner, other.cleaner) && cleaningCabinet == other.cleaningCabinet && id == other.id;
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
