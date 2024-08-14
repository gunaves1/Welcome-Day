package estruturaCondicional;

import java.util.Scanner;

public class Condicional2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int dia;
		System.out.println("Informe o dia da semana: ");
		dia = ler.nextInt();

		switch (dia) {
		case 1:
			System.out.println("O dia é Domingo!");
			break;
		case 2:
			System.out.println("O dia é Segunda!");
			break;
		case 3:
			System.out.println("O dia é Terça!");
			break;
		case 4:
			System.out.println("O dia é Quarta!");
			break;
		case 5:
			System.out.println("O dia é Quinta!");
			break;
		case 6:
			System.out.println("O dia é Sexta!");
			break;
		default :
			System.out.println("O dia informado não é válido.");
		}
		ler.close();
	}
}
