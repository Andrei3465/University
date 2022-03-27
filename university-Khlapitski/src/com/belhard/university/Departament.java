package com.belhard.university;

import java.util.Arrays;

public class Departament extends Employee {

	private int number;
	private final Teacher[] teachers = new Teacher[8];
	private final Manager[] managers = new Manager[1];
	private final Deputy[] deputys = new Deputy[1];
	private final Cleaner[] cleaners = new Cleaner[1];
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

//	double th1Salary = AccountantUtil.salary(th1);
//	double th1Prize = AccountantUtil.prize(th1);
//	double th1VacationPay = AccountantUtil.vacationPay(th1);
//	double th1degreeAllowance = AccountantUtil.degreeAllowance(th1);
//	
//	double th2Salary = AccountantUtil.salary(th2);
//	double th2Prize = AccountantUtil.prize(th2);
//	double th2VacationPay = AccountantUtil.vacationPay(th2);
//	double th2degreeAllowance = AccountantUtil.degreeAllowance(th2);
//	
//	double th3Salary = AccountantUtil.salary(th3);
//	double th3Prize = AccountantUtil.prize(th3);
//	double th3VacationPay = AccountantUtil.vacationPay(th3);
//	double th3degreeAllowance = AccountantUtil.degreeAllowance(th3);
//	 
//	double th4Salary = AccountantUtil.salary(th4);
//	double th4Prize = AccountantUtil.prize(th4);
//	double th4VacationPay = AccountantUtil.vacationPay(th4);
//	double th4degreeAllowance = AccountantUtil.degreeAllowance(th4);
//	 
//	double th5Salary = AccountantUtil.salary(th5);
//	double th5Prize = AccountantUtil.prize(th5);
//	double th5VacationPay = AccountantUtil.vacationPay(th5);
//	double th5degreeAllowance = AccountantUtil.degreeAllowance(th5);
//	 
//	double th6Salary = AccountantUtil.salary(th6);
//	double th6Prize = AccountantUtil.prize(th6);
//	double th6VacationPay = AccountantUtil.vacationPay(th6);
//	double th6degreeAllowance = AccountantUtil.degreeAllowance(th6);
//	 
//	double th7Salary = AccountantUtil.salary(th7);
//	double th7Prize = AccountantUtil.prize(th7);
//	double th7VacationPay = AccountantUtil.vacationPay(th7);
//	double th7degreeAllowance = AccountantUtil.degreeAllowance(th7);
//	 
//	double th8Salary = AccountantUtil.salary(th8);
//	double th8Prize = AccountantUtil.prize(th8);
//	double th8VacationPay = AccountantUtil.vacationPay(th8);
//	double th8degreeAllowance = AccountantUtil.degreeAllowance(th8);
//
//	 
//	double cl1Salary = AccountantUtil.salaryCleaner(cl1);
//	double cl1Prize = AccountantUtil.prize(cl1);
//	double cl1VacationPay = AccountantUtil.vacationPay(cl1);
//
//	 
//	double mg1Salary = AccountantUtil.salary(mg1);
//	double mg1Prize = AccountantUtil.prize(mg1);
//	double mg1VacationPay = AccountantUtil.vacationPay(mg1);
//	double mg1degreeAllowance = AccountantUtil.degreeAllowance(mg1);
//
//	 
//	double dp1Salary = AccountantUtil.salary(dp1);
//	double dp1Prize = AccountantUtil.prize(dp1);
//	double dp1VacationPay = AccountantUtil.vacationPay(dp1);
//	double dp1degreeAllowance = AccountantUtil.degreeAllowance(dp1);
//
//	public double totalCosts() {
//		double totalCosts = mg1Salary + mg1VacationPay + dp1Salary + dp1VacationPay + cl1Salary + cl1VacationPay
//				+ th1Salary + th1VacationPay + th2Salary + th2VacationPay + th3Salary + th3VacationPay + th4Salary
//				+ th4VacationPay + th5Salary + th5VacationPay + th6Salary + th6VacationPay + th7Salary + th7VacationPay
//				+ th8Salary + th8VacationPay;
//		return totalCosts;
//	}

	@Override
	public String introduceYourself() {
		// TODO Auto-generated method stub
		return null;
	}
}