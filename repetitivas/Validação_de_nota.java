package repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Validação_de_nota {

	/*
	 * Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a
média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao
intervalo [0,10]). Cada nota deve ser validada separadamente. 
	 */
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, media;
		
		System.out.print("Type the first grade: ");
		n1 = sc.nextDouble();
		
		while (n1 < 0 || n1 > 10) {
			System.out.print("Invalid value! Try again: ");
			n1 = sc.nextDouble();
		}
		
		System.out.print("Type the second grade: ");
		n2 = sc.nextDouble();
		
		while (n2 < 0 || n2 > 10) {
			System.out.print("Invalid value! Try again: ");
			n2 = sc.nextDouble();
		}
		
		media = (n1 + n2)/2;
		
		System.out.printf("Average: %.2f%n", media);
				
		sc.close();
	}

}
