package Estrutura_Repeticao_While;

import java.util.*;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = input.nextInt();

		while (numero > 0) {
			System.out.println("Dobro: " + (numero * 2));
			System.out.print("Digite um número: ");
			numero = input.nextInt();
		}
		input.close();
	}
}