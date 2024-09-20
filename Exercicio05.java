package Estrutura_Repeticao_While;

import java.util.*;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int canal, pessoas = 0, totalPessoas = 0, contCanal4 = 0, contCanal5 = 0, contCanal7 = 0, contCanal12 = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Digite o numero do canal assistido (4 - 5 - 7 - 12 ou 0 para sair): ");
		canal = input.nextInt();

		while (canal != 0) {
			if (canal == 4) {
				System.out.print("Quantas pessoas estão assistindo ao canal " + canal + ": ");
				pessoas = input.nextInt();
				contCanal4 += pessoas;
			} else if (canal == 5) {
				System.out.print("Quantas pessoas estão assistindo ao canal " + canal + ": ");
				pessoas = input.nextInt();
				contCanal5 += pessoas;
			} else if (canal == 7) {
				System.out.print("Quantas pessoas estão assistindo ao canal " + canal + ": ");
				pessoas = input.nextInt();
				contCanal7 += pessoas;
			} else if (canal == 12) {
				System.out.print("Quantas pessoas estão assistindo ao canal " + canal + ": ");
				pessoas = input.nextInt();
				contCanal12 += pessoas;
			} else
				System.out.println("Canal inválido, tente novamente!");

			totalPessoas += pessoas;

			System.out.print("Digite o numero do canal assistido (4 - 5 - 7 - 12 ou 0 para sair): ");
			canal = input.nextInt();
		}

		System.out.println("Audiência do canal 4 é: " + contCanal4 * 100 / totalPessoas + "%");
		System.out.println("Audiência do canal 5 é: " + contCanal5 * 100 / totalPessoas + "%");
		System.out.println("Audiência do canal 7 é: " + contCanal7 * 100 / totalPessoas + "%");
		System.out.println("Audiência do canal 12 é: " + contCanal12 * 100 / totalPessoas + "%");

		input.close();
	}

}

