package repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Senha_fixa {
	/*
	 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de
senha incorreta informada, escrever a mensagem "Senha Invalida! Tente novamente:". Quando a senha
for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo
encerrado. Considere que a senha correta é o valor 2002.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int pass;
		
		System.out.print("Inform the password: ");
		pass = sc.nextInt();
		
		while (pass != 2002) {
			System.out.print("Invalid Password! Try again: ");
			pass = sc.nextInt();
		}
		
		System.out.println("Access granted!");
		
		sc.close();
	}

}
