package array;

import java.util.Scanner;

public class Numeros_pares {
	/*
	Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
	tela todos os números pares, e também a quantidade de números pares.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers will you type? ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Type a number: ");
			array[i] = sc.nextInt();
		}

		System.out.println("Even numbers: ");
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0) {
				count ++;
				System.out.print(array[i] + " ");
			}
		}
		
		System.out.println("\nThe amount of even numbers: " + count);
		
		sc.close();
	}

}
