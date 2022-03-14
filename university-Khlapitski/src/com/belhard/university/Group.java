package com.belhard.university;

import java.util.Arrays;

public class Group {
	private int number;
	private Teacher teacher;
	private final Student[] students = new Student[8];
	private int numberOfStudents;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public boolean addStudent(Student student) {
		if (numberOfStudents < students.length) {
			students[numberOfStudents++] = student;
			return true;
		}
		return false;
	}
class Student extends Person{
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
}
class Teacher extends Person{
	public String getList() {
		String list = "#####Group " + number + "#####\n";
		list += "Teacher: ";
		if (teacher != null) {
			list += "{id: " + teacher.getId() + "} " + teacher.getFirstName() + " " + teacher.getLastName() + " "
					+ teacher.getEmail() + "\n";
		} else {
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
}
@Override
public String toString() {
	return "Group [number=" + number + ", teacher=" + teacher + ", students=" + Arrays.toString(students)
			+ ", numberOfStudents=" + numberOfStudents + ", getNumber()=" + getNumber() + ", getTeacher()="
			+ getTeacher() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}
}
