package array;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
	
	/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
	tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
	bem como os nomes dessas pessoas caso houver. 
	*/
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people will be accounted for? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] age = new int[n];
		double[] height = new double[n];
		
		double total = 0, avg, lessthan16 = 0, p16;
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Data of person number " + (i+1) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			name[i] = sc.nextLine();
			System.out.print("Age: ");
			age[i] = sc.nextInt();
			System.out.print("Height: ");
			height[i] = sc.nextDouble();
			total += height[i];
			count++;
			if (age[i] < 16) {
				lessthan16++;
			}
		}
		
		avg = total/count;
		p16 = (lessthan16 * 100)/count;
		
		System.out.println("Average height: " + avg);
		System.out.println("People with less than 16 years: " + p16 + "%");
		for (int i = 0; i < n; i++) {
			if (age[i] < 16) {
				System.out.println(name[i]);
			}
		}
		
		sc.close();
	}

}
