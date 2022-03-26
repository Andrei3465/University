package com.belhard.university;

public class Departament {

	Employee th1 = new Teacher("Bob", "Marley");
	double th1Salary = AccountantUtil.salary(th1);
	double th1Prize = AccountantUtil.prize(th1);
	double th1VacationPay = AccountantUtil.vacationPay(th1);
	double th1degreeAllowance = AccountantUtil.degreeAllowance(th1);
	Employee th2 = new Teacher("John", "Travolta");
	double th2Salary = AccountantUtil.salary(th2);
	double th2Prize = AccountantUtil.prize(th2);
	double th2VacationPay = AccountantUtil.vacationPay(th2);
	double th2degreeAllowance = AccountantUtil.degreeAllowance(th2);
	Employee th3 = new Teacher("Bryce", "LI");
	double th3Salary = AccountantUtil.salary(th3);
	double th3Prize = AccountantUtil.prize(th3);
	double th3VacationPay = AccountantUtil.vacationPay(th3);
	double th3degreeAllowance = AccountantUtil.degreeAllowance(th3);
	Employee th4 = new Teacher("Bred", "Pit");
	double th4Salary = AccountantUtil.salary(th4);
	double th4Prize = AccountantUtil.prize(th4);
	double th4VacationPay = AccountantUtil.vacationPay(th4);
	double th4degreeAllowance = AccountantUtil.degreeAllowance(th4);
	Employee th5 = new Teacher("Donald", "Tramp");
	double th5Salary = AccountantUtil.salary(th5);
	double th5Prize = AccountantUtil.prize(th5);
	double th5VacationPay = AccountantUtil.vacationPay(th5);
	double th5degreeAllowance = AccountantUtil.degreeAllowance(th5);
	Employee th6 = new Teacher("James", "Bond");
	double th6Salary = AccountantUtil.salary(th6);
	double th6Prize = AccountantUtil.prize(th6);
	double th6VacationPay = AccountantUtil.vacationPay(th6);
	double th6degreeAllowance = AccountantUtil.degreeAllowance(th6);
	Employee th7 = new Teacher("Ivan", "Ivanov");
	double th7Salary = AccountantUtil.salary(th7);
	double th7Prize = AccountantUtil.prize(th7);
	double th7VacationPay = AccountantUtil.vacationPay(th7);
	double th7degreeAllowance = AccountantUtil.degreeAllowance(th7);
	Employee th8 = new Teacher("Julia", "Ivanova");
	double th8Salary = AccountantUtil.salary(th8);
	double th8Prize = AccountantUtil.prize(th8);
	double th8VacationPay = AccountantUtil.vacationPay(th8);
	double th8degreeAllowance = AccountantUtil.degreeAllowance(th8);

	Employee cl1 = new Cleaner("Svetlana", "Petrova");
	double cl1Salary = AccountantUtil.salaryCleaner(cl1);
	double cl1Prize = AccountantUtil.prize(cl1);
	double cl1VacationPay = AccountantUtil.vacationPay(cl1);

	Employee mg1 = new Manager("Galina", "Sidorova");
	double mg1Salary = AccountantUtil.salary(mg1);
	double mg1Prize = AccountantUtil.prize(mg1);
	double mg1VacationPay = AccountantUtil.vacationPay(mg1);
	double mg1degreeAllowance = AccountantUtil.degreeAllowance(mg1);

	Employee dp1 = new Deputy("Oleg", "Sokolov");
	double dp1Salary = AccountantUtil.salary(dp1);
	double dp1Prize = AccountantUtil.prize(dp1);
	double dp1VacationPay = AccountantUtil.vacationPay(dp1);
	double dp1degreeAllowance = AccountantUtil.degreeAllowance(dp1);

	public double totalCosts() {
		double totalCosts = mg1Salary + mg1VacationPay + dp1Salary + dp1VacationPay + cl1Salary + cl1VacationPay + th1Salary + th1VacationPay
				+ th2Salary + th2VacationPay + th3Salary + th3VacationPay + th4Salary + th4VacationPay + th5Salary + th5VacationPay 
				+ th6Salary + th6VacationPay + th7Salary + th7VacationPay + th8Salary + th8VacationPay;
		return totalCosts;
	}

	@Override
	public String toString() {
		return "Departament [th1=" + th1 + ", th2=" + th2 + ", th3=" + th3 + ", th4=" + th4 + ", th5=" + th5 + ", th6="
				+ th6 + ", th7=" + th7 + ", th8=" + th8 + ", cl1=" + cl1 + ", mg1=" + mg1 + ", dp1=" + dp1
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
