package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code, amount;
		double price, total;
		
		System.out.print("Type the product's code: ");
		code = sc.nextInt();
		System.out.print("Type the amount bought: ");
		amount = sc.nextInt();
		
		System.out.println(" ");
		System.out.print("The total price comes to: US$");
		
		price = 0;
		
		if (code == 1) {
			price = 5;
		}
		else if (code == 2) {
			price = 3.5;
		}
		else if (code == 3) {
			price = 4.8;
		}
		else if(code == 4) {
			price = 8.9;
		}
		else {
			price = 7.32;
		}
		
		total = price * amount;
		System.out.printf("%.2f%n", + total);
		
		sc.close();
	}
}
