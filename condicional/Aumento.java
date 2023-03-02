package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Aumento {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salary, nsalary, percentage, raise;
		
		System.out.print("Inform the salary: ");
		salary = sc.nextDouble();
		
		percentage = 0;
		nsalary = 0;
		if (salary <= 1000) {
			nsalary = salary + (salary/5);
			percentage = 20;
		}
		else if (salary > 1000 || salary <= 3000){
			nsalary = salary + (salary * 3/20);
			percentage = 15;
		}
		else if (salary > 3000 || salary <= 8000) {
			nsalary = salary + (salary/10);
			percentage = 10;
		}
		else if (salary > 8000) {
			nsalary = salary + (salary /20);
			percentage = 5;
		}
		
		raise = nsalary - salary;
		
		System.out.printf("New salary: US$%.2f%n", nsalary);
		System.out.printf("Raise: US$%.2f%n", raise);
		System.out.print("Percentage: " + percentage + "%");
		
		sc.close();
	}

}
