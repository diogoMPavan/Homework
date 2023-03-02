package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Area_Do_Circulo {

	/*
	 *  Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		casas decimais conforme exemplos
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double area, r;
		
		System.out.print("Type the value of the radius: ");
		r = sc.nextDouble();
		
		area = Math.PI * (r * r);
		
		System.out.printf("Area: %.4f%n", area);
		
		sc.close();
	}

}
