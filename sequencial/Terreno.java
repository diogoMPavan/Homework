package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Terreno {

	/*
	 * Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma
casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida,
o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com
duas casas decimais, conforme exemplo. 
	 */
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double width, length, sm, area, price;
		
		System.out.print("Type the terrain's width: ");
		width = sc.nextInt();
		System.out.print("Type the terrain's length: ");
		length = sc.nextInt();
		System.out.print("Type the value of the square meter: ");
		sm = sc.nextInt();
		
		area = width * length;
		price = sm * area;
		
		System.out.println("The total area is: " + area + "m");
		System.out.printf("The total value is: R$%.2f%n", price);
		
		sc.close();
	}

}
