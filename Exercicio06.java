package Estrutura_Repeticao_While;

import java.util.*;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario, totalSalario = 0, contSalario = 0;
		int filhos = 0, totalFilhos = 0, contFilhos = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("A qualquer momento, digite um número negativo em \"Informe seu salário\" para sair!");

		System.out.print("\nInforme seu salário: ");
		salario = input.nextDouble();

		while (salario >= 0) {
			totalSalario += salario;
			contSalario++;

			System.out.print("Informe quantos filhos tem: ");
			filhos = input.nextInt();
			totalFilhos += filhos;
			contFilhos++;

			System.out.print("\nInforme seu salário: ");
			salario = input.nextDouble();
		}
		System.out.println("A média de salário é: " + totalSalario / contSalario);
		System.out.println("A média de filhos é: " + totalFilhos / contFilhos);

		input.close();
	}

}
