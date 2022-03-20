package com.belhard.university;

import java.util.Arrays;

public class Group extends Person {
	private int number;
	private final Teacher[] teachers = new Teacher[8];
	private final Student[] students = new Student[8];
	private int numberOfStudents;
	private int numberOfTeachers;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean addTeacher(Teacher teacher) {
		if (numberOfTeachers < teachers.length) {
			teachers[numberOfTeachers++] = teacher;
			return true;
		}
		return false;
	}

	public void Teacher(String firstName, String lastName) {
	}

	public boolean removeTeacher(Teacher teacher) {
		boolean removed = false;
		for (int i = 0; i < numberOfTeachers; i++) {
			Person elm = teachers[i];
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

	public void Student(String firstName, String lastName) {
	}

	public boolean removeStudent(Student student) {
		boolean removed = false;
		for (int i = 0; i < numberOfStudents; i++) {
			Person elm = students[i];
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

	public String getList() {
		String list = "#####Group " + number + "#####\n";
		list += "Teacher: ";
		for (int i = 0; i < teachers.length; i++) {
			Person teacher = teachers[i];
			if (teacher == null) {
				break;
			}
			list += (i + 1) + ". {id: " + teacher.getId() + "} " + teacher.getFirstName() + " " + teacher.getLastName()
					+ " " + teacher.getEmail() + "\n";

			list += "NOT APPOINTED\n";
		}
		list += "Students:\n";
		for (int i = 0; i < students.length; i++) {
			Person student = students[i];
			if (student == null) {
				break;
			}
			list += (i + 1) + ". {id:" + student.getId() + "} " + student.getFirstName() + " " + student.getLastName()
					+ " " + student.getEmail() + "\n";
		}
		return list;
	}

	@Override
	public String toString() {
		return "Group [number=" + number + ", teachers=" + Arrays.toString(teachers) + ", students="
				+ Arrays.toString(students) + ", numberOfStudents=" + numberOfStudents + ", numberOfTeachers="
				+ numberOfTeachers + "]";
	}

}
