package com.belhard.university;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		 
		Student st1 = new Student("Andrei", "Bulkin");
		st1.setEmail("student1@gmail.com");
		st1.setAddress(new Address("Belarus", "Slutsk", "Chehova", "51", 65));
		st1.setDateOfBirth(LocalDate.of(1989, 12, 20));
		st1.setisBudget(true);
		st1.setAcademicPerformance(3);
		Student st2 = new Student("Mike", "Tyson");
		st2.setEmail("student2@gmail.com");
		st2.setAddress(new Address("Belarus", "Minsk", "Chehova", "51", 66));
		st2.setDateOfBirth(LocalDate.of(1989, 12, 21));
		st2.setisBudget(true);
		st2.setAcademicPerformance(5);
		Student st3 = new Student("Arnold", "Shvaceniger");
		st3.setEmail("student3@gmail.com");
		st3.setAddress(new Address("Belarus", "Grodno", "Chehova", "51", 67));
		st3.setDateOfBirth(LocalDate.of(1989, 12, 22));
		st3.setisBudget(false);
		st3.setAcademicPerformance(8);
		Student st4 = new Student("Jason", "Statham");
		st4.setEmail("student4@gmail.com");
		st4.setAddress(new Address("Belarus", "Bereza", "Chehova", "51", 68));
		st4.setDateOfBirth(LocalDate.of(1989, 12, 23));
		st4.setisBudget(false);
		st4.setAcademicPerformance(8);
		Student st5 = new Student("Barak", "Obama");
		st5.setEmail("student5@gmail.com");
		st5.setAddress(new Address("Belarus", "Gomel", "Chehova", "51", 69));
		st5.setDateOfBirth(LocalDate.of(1989, 12, 24));
		st5.setisBudget(true);
		st5.setAcademicPerformance(7);
		Student st6 = new Student("Bob", "Sinclar");
		st6.setEmail("student6@gmail.com");
		st6.setAddress(new Address("Belarus", "Soligorsk", "Chehova", "51", 70));
		st6.setDateOfBirth(LocalDate.of(1989, 12, 25));
		st6.setisBudget(true);
		st6.setAcademicPerformance(6);
		Student st7 = new Student("Tereza", "May");
		st7.setEmail("student7@gmail.com");
		st7.setAddress(new Address("Belarus", "Nesvizh", "Chehova", "51", 71));
		st7.setDateOfBirth(LocalDate.of(1989, 12, 26));
		st7.setisBudget(true);
		st7.setAcademicPerformance(9);
		Student st8 = new Student("Brithni", "Spears");
		st8.setEmail("student8@gmail.com");
		st8.setAddress(new Address("Belarus", "Kopyl", "Chehova", "51", 72));
		st8.setDateOfBirth(LocalDate.of(1989, 12, 27));
		st8.setisBudget(false);
		st8.setAcademicPerformance(4);

		Teacher th1 = new Teacher("Bob", "Marley");
		Teacher th2 = new Teacher("John", "Travolta");
		Teacher th3 = new Teacher("Bryce", "LI");
		Teacher th4 = new Teacher("Bred", "Pit");
		Teacher th5 = new Teacher("Donald", "Tramp");
		Teacher th6 = new Teacher("James", "Bond");
		Teacher th7 = new Teacher("Ivan", "Ivanov");
		Teacher th8 = new Teacher("Julia", "Ivanova");

		Cleaner cl1 = new Cleaner("Svetlana", "Petrova");
		cl1.setSalary(1500);

		Manager mg1 = new Manager("Galina", "Sidorova");

		Deputy dp1 = new Deputy("Oleg", "Sokolov");

		Departament departament = new Departament();
		departament.addTeacher(th1);
		departament.addTeacher(th2);
		departament.addTeacher(th3);
		departament.addTeacher(th4);
		departament.addTeacher(th5);
		departament.addTeacher(th6);
		departament.addTeacher(th7);
		departament.addTeacher(th8);
		departament.addCleaner(cl1);
		departament.addManager(mg1);
		departament.addDeputy(dp1);

		Group group = new Group();
		group.setNumber(37);
		group.addTeacher(th1);
		group.addStudent(st1);
		group.addStudent(st2);
		group.addStudent(st3);
		group.addStudent(st4);
		group.addStudent(st5);
		group.addStudent(st6);
		group.addStudent(st7);
		group.addStudent(st8);

		System.out.println("INITIAL GROUP:\n" + group.getList());

		group.removeStudent(st4);
		group.removeStudent(st6);
		group.removeStudent(st2);
		group.removeTeacher(th1);

		System.out.println("REMOVED STUDENT - 4; 6; 2:\n" + "REMOVED TEACHER - 1:\n" + group.getList());

		group.addStudent(new Student("Peter", "Parker"));
		group.addStudent(new Student("Tony", "Stark"));
		group.addStudent(new Student("Melinda", "May"));
		group.addTeacher(new Teacher("Ozzy", "Osborn"));

		System.out.println("ADDED NEW STUDENT:\n" + group.getList());
		System.out.println(departament.depList() + "\n" + "*****Total costs***** \n");
	}

	@Override
	public String toString() {
		return "App [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
