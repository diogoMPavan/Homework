package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Pecas {
	
	/*
	 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String p1, p2;
		int amount1, amount2;
		double v1, v2, total;
		
		System.out.print("Inform the desired part: ");
		p1 = sc.nextLine();
		System.out.print("Inform the amount bought: ");
		amount1 = sc.nextInt();
		System.out.print("Inform the value: ");
		v1 = sc.nextDouble();
		System.out.print("Inform the next desired part: ");
		sc.nextLine();
		p2 = sc.nextLine();
		System.out.print("Inform the amount bought: ");
		amount2 = sc.nextInt();
		System.out.print("Inform the value: ");
		v2 = sc.nextDouble();
		
		total = (amount1 * v1) + (amount2 * v2);
		
		System.out.printf("The total value: US$%.2f%n", total);
		
		sc.close();
	}

}
