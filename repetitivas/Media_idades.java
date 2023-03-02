package repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Media_idades {
	
	/*
	 * Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um
indivíduo. O último dado, que não entrará nos cálculos, contém um valor de idade negativa. Calcular
e imprimir a idade média deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez,
mostrar a mensagem "IMPOSSIVEL CALCULAR".
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int age, tot, count;
		double avg;
		
		System.out.println("Type the ages: ");
		age = sc.nextInt();
		
		if (age < 0) {
			System.out.println("Impossible to calculate");
		}
		else {
		
		tot = 0;
		count = 0;
		
		while (age > 0) {
			tot = tot + age;
			count ++;
			age = sc.nextInt();
		}
		
		avg = tot/count;
		
		System.out.println("Average of the ages: " + avg);
		}
		
		sc.close();
	}

}
