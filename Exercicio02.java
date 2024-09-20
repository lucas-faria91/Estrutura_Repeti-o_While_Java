package Estrutura_Repeticao_While;

import java.util.*;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = input.nextInt();

		while (num >= 0) {
			System.out.println("Valor lido: " + num);
			System.out.println("Quadrado do número: " + Math.pow(num, 2));
			System.out.println("Cubo do número: " + Math.pow(num, 3));
			System.out.println("Raiz quadrada do número: " + Math.sqrt(num));
			if (num % 2 == 0)
				System.out.println("Número par!!");
			else
				System.out.println("Número ímpar!!");
			System.out.print("Digite um número: ");
			num = input.nextInt();
		}
		input.close();
	}
}
