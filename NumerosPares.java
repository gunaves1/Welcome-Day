package estruturaCondicional;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;

		for (int i = 1; i<=5; i++) {
			System.out.println("Informe um número:");
			numero = ler.nextInt();
			
			if (numero%2 == 1) {
		}
			else {
				System.out.println(numero + " é par");
			}
		}
		ler.close();
	}
}
