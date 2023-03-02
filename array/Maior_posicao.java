package array;

import java.util.Scanner;

public class Maior_posicao {

	/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
	o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
	considerando a primeira posição como 0 (zero).
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("How many numbers will you type? ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		int maior = 0, c = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Type a number: ");
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (array[i] > maior) {
				maior = array[i];
				c = i + 1;
			}
		}
		System.out.println("Biggest value: " + maior);
		System.out.println("Position of that value: " + c);
		
		sc.close();
	}

}
