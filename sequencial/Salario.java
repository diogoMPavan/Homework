package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Salario {

	/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
	hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
	decimais. 
	*/
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		int hour;
		double vh, salary;
		
		System.out.print("Type your name: ");
		name = sc.nextLine();
		System.out.print("Type the hours you work: ");
		hour = sc.nextInt();
		System.out.print("Type the value per hour: ");
		vh = sc.nextDouble();
		
		salary = vh * hour;
		
		System.out.println(name + " makes R$" + salary + " a month");
		
		sc.close();
	}

}
