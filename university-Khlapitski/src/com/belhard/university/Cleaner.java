package com.belhard.university;

public class Cleaner {
	
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
	

}
