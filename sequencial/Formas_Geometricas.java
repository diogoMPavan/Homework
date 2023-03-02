package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Formas_Geometricas {
	
	/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
	mostre:
	a) a área do triângulo retângulo que tem A por base e C por altura.
	b) a área do círculo de raio C. (pi = 3.14159)
	c) a área do trapézio que tem A e B por bases e C por altura.
	d) a área do quadrado que tem lado B.
	e) a área do retângulo que tem lados A e B.
	*/

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double v1, v2, v3, triangle, circle, trapeze, square, rectangle;
		
		System.out.println("Type three values: ");
		v1 = sc.nextFloat();
		v2 = sc.nextFloat();
		v3 = sc.nextFloat();
		
		triangle = (v1 * v3)/2;
		circle = Math.PI * (v3 * v3);
		trapeze = ((v1 + v2) * v3)/2;
		square = v2 * v2;
		rectangle = v1 * v2;
		
		System.out.printf("Triangle's area: %.3f%n", triangle);
		System.out.printf("Circle's area: %.3f%n", circle);
		System.out.printf("Trapeze's area: %.3f%n", trapeze);
		System.out.printf("Square's area: %.3f%n", square);
		System.out.printf("Rectangle's area: %.3f%n", rectangle);
		
		sc.close();
	}

}
