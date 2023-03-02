package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Coordenadas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double x, y;
		String quad;
		
		System.out.print("Type the value of X: ");
		x = sc.nextDouble();
		System.out.print("Type the value of Y: ");
		y = sc.nextDouble();
		
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
		else {
			quad = "Origin";
		}
		
		System.out.println(quad);
		
		sc.close();
	}

}
