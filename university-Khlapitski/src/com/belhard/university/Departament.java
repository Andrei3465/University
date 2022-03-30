package com.belhard.university;

import java.util.ArrayList;
import java.util.Arrays;

public class Departament implements Identifiable {

	private int number;
	private final ArrayList<Teacher> teachers = new ArrayList<>();
	private final ArrayList<Manager> managers = new ArrayList<>();
	private final ArrayList<Deputy> deputys = new ArrayList<>();
	private final ArrayList<Cleaner> cleaners = new ArrayList<>();
	private int numberOfTeachers;
	private int numberOfManagers;
	private int numberOfDeputys;
	private int numberOfCleaners;

	public boolean addTeacher(Teacher teacher) {
		if (numberOfTeachers < teachers.length) {
			teachers[numberOfTeachers++] = teacher;
			return true;
		}
		return false;
	}

	public boolean addManager(Manager manager) {
		if (numberOfManagers < managers.length) {
			managers[numberOfManagers++] = manager;
			return true;
		}
		return false;
	}

	public boolean addDeputy(Deputy deputy) {
		if (numberOfDeputys < deputys.length) {
			deputys[numberOfDeputys++] = deputy;
			return true;
		}
		return false;
	}

	public boolean addCleaner(Cleaner cleaner) {
		if (numberOfCleaners < cleaners.length) {
			cleaners[numberOfCleaners++] = cleaner;
			return true;
		}
		return false;
	}

	public boolean removeTeacher(Teacher teacher) {
		boolean removed = false;
		for (int i = 0; i < numberOfTeachers; i++) {
			Teacher elm = teachers[i];
			if (elm.getId() == teacher.getId()) {
				teachers[i] = null;
				removed = true;
			}
			if (removed) {
				if (i != numberOfTeachers - 1) {
					teachers[i] = teachers[i + 1];
				} else {
					teachers[i] = null;
				}
			}
		}
		if (removed) {
			numberOfTeachers--;
		}
		return removed;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String depList() {
		String list = "************DEPARTAMENT*************\n";
		list += "Teacher:\n";
		for (int i = 0; i < teachers.length; i++) {
			Teacher teacher = teachers[i];
			if (teacher == null) {
				break;
			}
			list += (i + 1) + ". {id: " + teacher.getId() + "} " + teacher.getFirstName() + " " + teacher.getLastName()
					+ " " + "\n";
		}

		list += "Manager:\n";
		for (int i = 0; i < managers.length; i++) {
			Manager manager = managers[i];
			if (manager == null) {
				break;
			}
			list += (i + 1) + ". {id: " + manager.getId() + "} " + manager.getFirstName() + " " + manager.getLastName()
					+ " " + "\n";
		}

		list += "Deputy:\n";
		for (int i = 0; i < deputys.length; i++) {
			Deputy deputy = deputys[i];
			if (deputy == null) {
				break;
			}
			list += (i + 1) + ". {id: " + deputy.getId() + "} " + deputy.getFirstName() + " " + deputy.getLastName()
					+ " " + "\n";
		}

		list += "Cleaner:\n";
		for (int i = 0; i < cleaners.length; i++) {
			Cleaner cleaner = cleaners[i];
			if (cleaner == null) {
				break;
			}
			list += (i + 1) + ". {id: " + cleaner.getId() + "} " + cleaner.getFirstName() + " " + cleaner.getLastName()
					+ " " + "\n";
		}
		return list;
	}

	@Override
	public String toString() {
		return "Departament [number=" + number + ", teachers=" + Arrays.toString(teachers) + ", managers="
				+ Arrays.toString(managers) + ", deputys=" + Arrays.toString(deputys) + ", cleaners="
				+ Arrays.toString(cleaners) + ", numberOfTeachers=" + numberOfTeachers + ", numberOfManagers="
				+ numberOfManagers + ", numberOfDeputys=" + numberOfDeputys + ", numberOfCleaners=" + numberOfCleaners
				+ ", getNumber()=" + getNumber() + ", depList()=" + depList() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int idNum() {
		// TODO Auto-generated method stub
		return 0;
	}
}