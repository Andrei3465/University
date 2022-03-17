package com.belhard.university;

public class Departament {

	class Group extends Person {
		Teacher th1 = new Teacher("Bob", "Marley");
		Teacher th2 = new Teacher("John", "Travolta");
		Teacher th3 = new Teacher("Bryce", "LI");
		Teacher th4 = new Teacher("Bred", "Pit");
		Teacher th5 = new Teacher("Donald", "Tramp");
		Teacher th6 = new Teacher("James", "Bond");
		Teacher th7 = new Teacher("Ivan", "Ivanov");
		Teacher th8 = new Teacher("Julia", "Ivanova");
		
		Cleaner cl1 = new Cleaner("Svetlana", "Petrova");
		
		Manager mg1 = new Manager ("Galina", "Sidorova");
		
		Deputy dp1 = new Deputy("Oleg", "Sokolov");
	}
}
