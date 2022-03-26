package com.belhard.university;

import java.util.Arrays;

public class Group {
	private int number;
	private final Teacher[] teachers = new Teacher[1];
	private final Student[] students = new Student[8];
	private int numberOfStudents;
	private int numberOfTeachers;

	public boolean addTeacher(Teacher teacher) {
		if (numberOfTeachers < teachers.length) {
			teachers[numberOfTeachers++] = teacher;
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

	public boolean addStudent(Student student) {
		if (numberOfStudents < students.length) {
			students[numberOfStudents++] = student;
			return true;
		}
		return false;
	}

	public boolean removeStudent(Student student) {
		boolean removed = false;
		for (int i = 0; i < numberOfStudents; i++) {
			Student elm = students[i];
			if (elm.getId() == student.getId()) {
				students[i] = null;
				removed = true;
			}
			if (removed) {
				if (i != numberOfStudents - 1) {
					students[i] = students[i + 1];
				} else {
					students[i] = null;
				}
			}
		}
		if (removed) {
			numberOfStudents--;
		}
		return removed;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getList() {
		String list = "************Group " + number + "*************\n";
		list += "Teacher: ";
		for (int i = 0; i < teachers.length; i++) {
			Teacher teacher = teachers[i];
			if (teacher == null) {
				break;
			}
			list += (i + 1) + ". {id: " + teacher.getId() + "} " + teacher.getFirstName() + " " + teacher.getLastName()
					+ " " + teacher.getEmail() + "\n";

			list += "NOT APPOINTED\n";
		}
		list += "Students:\n";
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			if (student == null) {
				break;
			}
			list += (i + 1) + ". {id:" + student.getId() + "} " + student.getFirstName() + " " + student.getLastName()
					+ " , Email: " + student.getEmail() + " , Is Budget - " + student.getIsBudget() + " " + student.getAcademicPerformance() 
					+ " " + student.getAddress() + " , Date of birth: " + student.getDateOfBirth() + "\n";
		}
		return list;
	}

	@Override
	public String toString() {
		return "Group [number=" + number + ", teachers=" + Arrays.toString(teachers) + ", students="
				+ Arrays.toString(students) + ", numberOfStudents=" + numberOfStudents + ", numberOfTeachers="
				+ numberOfTeachers + ", getNumber()=" + getNumber() + ", getList()=" + getList() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
