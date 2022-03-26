package com.belhard.university;

public class Manager extends Employee {
	Manager manager;

	private static long counter = 1;
	private long id;

	public Manager(String firstName, String lastName) {
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
