package Estrutura_Repeticao_While;

import java.util.*;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matricula, nota1, nota2, nota3, media;

		Scanner input = new Scanner(System.in);

		System.out.print("Digite a matrícula do aluno: ");
		matricula = input.nextInt();

		while (matricula > 0) {
			System.out.print("Informe a primeira nota do aluno: ");
			nota1 = input.nextInt();
			System.out.print("Informe a segunda nota do aluno: ");
			nota2 = input.nextInt();
			System.out.print("Informe a terceira nota do aluno: ");
			nota3 = input.nextInt();

			media = (nota1 + nota2 + nota3) / 3;

			if (media >= 70) {
				System.out.println("Aprovado!");
			}
			if (media >= 60 && media < 70) {
				System.out.println("Exame Final!");
			}
			if (media < 60 && media > 0) {
				System.out.println("Reprovado!");
			}
			System.out.println("\"Para sair do sistema digite qualquer número negativo a seguir.\"");
			System.out.print("Digite a matrícula do próximo aluno: ");
			matricula = input.nextInt();

		}

		System.out.println("Programa encerrado.");
		
		input.close();
	}

}
