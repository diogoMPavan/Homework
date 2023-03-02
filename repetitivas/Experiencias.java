package repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Experiencias {

	/*
	Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para
	organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano,
	quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada. Este
	laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas
	informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia
	utilizada e a quantidade de cobaias utilizadas em cada experimento. Faça um programa que leia um
	valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um
	inteiro que representa a quantidade de cobaias utilizadas e uma letra ('C', 'R' ou 'S'), indicando o tipo
	de cobaia (R:Rato S:Sapo C:Coelho). Apresente o total de cobaias utilizadas, o total de cada tipo de
	cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o
	percentual deve ser apresentado com dois dígitos após o ponto. 
	*/
	
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tests, amount, total, bunny, rat, frog;
		double pb, pr, pf;
		char type;
		
		
		System.out.print("How many tests will be performed? ");
		tests = sc.nextInt();
		
		total = 0;
		bunny = 0;
		rat = 0;
		frog = 0;
		for (int x = 0; x < tests; x++) {
			System.out.print("Guinea Pig amount: ");
			amount = sc.nextInt();
			System.out.print("Type(B as in Bunny, R as in Rat and F as in Frog): ");
			type = sc.next().charAt(0);
			
			total += amount;
			
				if(type == 'B') {
					bunny += amount;
				}
				else if (type == 'R') {
					rat += amount;
				}
				else {
					frog += amount;
				}
		}
		
		pb = ((double)bunny * 100)/total;
		pr = ((double)rat * 100)/total;
		pf = ((double)frog * 100)/total;
		
		System.out.print("Total: " + total + " guinea pigs\n");
		System.out.print("Total bunnys: " + bunny + "\n");
		System.out.print("Total rats: " + rat + "\n");
		System.out.print("Total frogs: " + frog + "\n");
		System.out.print("Bunny percentage: " + pb + "%\n");
		System.out.print("Rat percentage: " + pr + "%\n");
		System.out.print("Frog percentage: " + pf + "%\n");
		
		sc.close();
	}

}
