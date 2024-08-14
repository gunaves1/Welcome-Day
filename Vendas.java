package estruturaCondicional;

import java.util.Scanner;

public class Vendas {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma,s1,s2,s3,s4;

		System.out.println("Informe o número de vendas da primeira semana: ");
		s1 = ler.nextInt();

		System.out.println("Informe o número de vendas da segunda semana: ");
		s2 = ler.nextInt();

		System.out.println("Informe o número de vendas da terceira semana: ");
		s3 = ler.nextInt();

		System.out.println("Informe o número de vendas da quarta semana: ");
		s4 = ler.nextInt();

		soma = s1+s2+s3+s4;

		switch (soma) {

		case 1:
			System.out.println("Sem bônus");
			break;
		case 2:
			System.out.println("Sem bônus");
			break;
		case 3:
			System.out.println("Sem bônus");
			break;
		case 4:
			System.out.println("Sem bônus");
			break;
		case 5:
			System.out.println("Sem bônus");
			break;
		case 6:
			System.out.println("Sem bônus");
			break;
		case 7:
			System.out.println("Sem bônus");
			break;
		case 8:
			System.out.println("Sem bônus");
			break;
		case 9:
			System.out.println("Sem bônus");
			break;
		case 10:
			System.out.println("Seu bônus será de R$100,00");
			break;
		case 11:
			System.out.println("Seu bônus será de R$100,00");
			break;
		case 12:
			System.out.println("Seu bônus será de R$100,00");
			break;
		case 13:
			System.out.println("Seu bônus será de R$100,00");
			break;
		case 14:
			System.out.println("Seu bônus será de R$100,00");
			break;
		case 15:
			System.out.println("Seu bônus será de R$100,00");
			break;
		case 16:
			System.out.println("Seu bônus será de R$300,00");
			break;
		case 17:
			System.out.println("Seu bônus será de R$300,00");
			break;
		case 18:
			System.out.println("Seu bônus será de R$300,00");
			break;
		case 19:
			System.out.println("Seu bônus será de R$300,00");
			break;
		case 20:
			System.out.println("Seu bônus será de R$300,00");
			break;
		default :
			System.out.println("Seu bônus será de R$500,00");
		}
		ler.close();
	}
}