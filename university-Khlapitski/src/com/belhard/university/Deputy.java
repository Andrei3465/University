package com.belhard.university;

public class Deputy extends Employee {

	private static long counter = 1;
	private long id;

	public Deputy(String firstName, String lastName) {
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

	@Override
	public String introduceYourself() {
		// TODO Auto-generated method stub
		return null;
	}
}
