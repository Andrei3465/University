package com.belhard.university;

import java.time.LocalDate;

public class Person {
	private static long counter = 1;
	private long id;
	public String firstName;
	public String lastName;
	private LocalDate dateOfBirth;
	private Address address;
	private int phoneNumber;
	private String email;

	class Student extends Person {
		public Student(String firstName, String lastName) {
			id = counter++;
			this.firstName = firstName;
			this.lastName = lastName;
		}
	}

	class Teacher extends Person {
		public Teacher(String firstName, String lastName) {
			id = counter++;
			this.firstName = firstName;
			this.lastName = lastName;
		}
	}

	public static long getCounter() {
		return counter;
	}

	public static void setCounter(long counter) {
		Person.counter = counter;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", getId()=" + getId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getDateOfBirth()=" + getDateOfBirth() + ", getAddress()=" + getAddress() + ", getPhoneNumber()="
				+ getPhoneNumber() + ", getEmail()=" + getEmail() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
