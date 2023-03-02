package repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Quadrante {
	
	/*
	 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no
sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence (Q1, Q2, Q3 ou Q4). O
algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem
escrever mensagem alguma).
	 * 
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		String quad;
		
		quad = "a";
		
		System.out.println("Type the coordinates for X and Y: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				quad = "Q1";
			}
			else if (x > 0 || y < 0) {
				quad = "Q4";
			}
			else if (x < 0 || y < 0) {
				quad = "Q3";
			}
			else if (x < 0 || y > 0) {
				quad = "Q2";
			}
			System.out.println(quad);			
			System.out.println("Type the coordinates for X and Y: ");
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		sc.close();
	}

}
