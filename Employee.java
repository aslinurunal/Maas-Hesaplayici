package Salary;

public class Employee {

	String name;
	double salary;
	int workHours;
	int hireYear;

	Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.workHours = workHours;
		this.hireYear = hireYear;
		this.salary = salary;
	}

	double tax() {
		if (this.salary > 1000) {
			return this.salary * 0.03;
		} else {
			return 0;
		}
	}

	int bonus() {
		if (this.workHours > 40) {
			return (workHours - 40) * 30;
		} else {
			return 0;
		}
	}

	double raiseSalary() {
		int year = 2022 - this.hireYear;
		if (year < 10) {
			return this.salary * 0.05;
		} else if (year > 9 && year < 20) {
			return this.salary * 0.1;
		} else {
			return this.salary * 0.15;
		}
	}

	void ToString() {
		System.out.println("Ad�: " + this.name);
		System.out.println("Maa��: " + this.salary);
		System.out.println("�al��ma Saati: " + this.workHours);
		System.out.println("Ba�lang�� Y�l�: " + this.hireYear);
		System.out.println("Vergi: " + tax());
		System.out.println("Bonus: " + bonus());
		System.out.println("Maa� Art���: " + raiseSalary());
		System.out.println("Vergi ve Bonuslar ile Birlikte Maa�: " + (this.salary + bonus() - tax()));
		System.out.println("Toplam Maa�: " + (this.salary +raiseSalary()));
	}
}
