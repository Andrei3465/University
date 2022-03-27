package com.belhard.university;

import java.util.Objects;

public class Address implements Identifiable {
	private String country;
	private String city;
	private String street;
	private String house;
	private int flat;

	public Address(String country, String city, String street, String house) {
		this.country = country;
		this.city = city;
		this.street = street;
		this.house = house;
	}

	public Address(String country, String city, String street, String house, int flat) {
		this(country, city, street, house);
		this.flat = flat;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setSteer(String street) {
		this.street = street;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public int getFlat() {
		return flat;
	}

	public void setFlat(int flat) {
		this.flat = flat;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, country, flat, house, street);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(country, other.country) && flat == other.flat
				&& Objects.equals(house, other.house) && Objects.equals(street, other.street);
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", street=" + street + ", house=" + house + ", flat="
				+ flat + "]";
	}
}
