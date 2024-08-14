package estruturaCondicional;

import java.util.Scanner;

public class NumerosInteiros {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, soma=0;

		for (int i = 1; i<=5; i++) {
			System.out.println("Informe um número:");
			numero = ler.nextInt();
			soma+=numero;
		}
		System.out.println("A soma de todos os números é: "+ soma);
		ler.close();
	}
}
