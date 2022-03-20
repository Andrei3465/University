package com.belhard.university;

public class App extends Group {

	public static void main(String[] args) {

		Student st1 = new Student("Andrei", "Bulkin");
		Student st2 = new Student("Mike", "Tyson");
		Student st3 = new Student("Arnold", "Shvaceniger");
		Student st4 = new Student("Jason", "Statham");
		Student st5 = new Student("Barak", "Obama");
		Student st6 = new Student("Bob", "Sinclar");
		Student st7 = new Student("Tereza", "May");
		Student st8 = new Student("Brithni", "Spears");

		Teacher th1 = new Teacher("Bob", "Marley");
		Teacher th2 = new Teacher("John", "Travolta");
		Teacher th3 = new Teacher("Bryce", "LI");

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

	}

	@Override
	public String toString() {
		return "App [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
