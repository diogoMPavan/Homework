package array;

import java.util.Scanner;

public class Soma_vetores {
	
	/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
	terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
	o vetor C gerado. 
	*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many values will each array contain?");
		int n = sc.nextInt();
		
		int[] A = new int[n];
		int[] B = new int[n];
		int[] sum = new int[n];
		
		System.out.println("Type the values of the array A:");
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}

		System.out.println("Type the values of the array B:");
		for (int i = 0; i < n; i++) {
			B[i] = sc.nextInt();
		}
		
		System.out.println("Resulting array: ");
		for (int i = 0; i < n; i++) {
			sum[i] = A[i] + B[i];
			System.out.println(sum[i]);
		}
		sc.close();
	}

}
