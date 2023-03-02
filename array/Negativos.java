package array;

import java.util.Scanner;

public class Negativos {
	
	/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
	e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will be typed? ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Type a number: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.println("\nNegative numbers: ");
		for (int i = 0; i < n; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();
	}

}
