package Estrutura_Repeticao_While;

import java.util.*;

public class Exercicio02a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int cont = 0, soma = 0;

		System.out.print("Digite uma idade: ");
		int idade = input.nextInt();

		while (idade > 0) {
			cont++;
			soma = soma + idade;

			System.out.print("Digite uma idade: ");
			idade = input.nextInt();
		}

		if (cont > 0) {
			System.out.format("\nForam informadas %d idades", cont);
			System.out.format("\nA média das idades foi %.2f \n", (double)soma / cont);
		} else
			System.out.println("\nNenhuma idade foi informada!");
	
		input.close();
	}
}
