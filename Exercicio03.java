package Estrutura_Repeticao_While;

import java.util.*;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int faltas, contNotas = 0, contAcima90 = 0, contReprovado = 0;
		double nota = 0, soma = 0, maior = 0, menor = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Digite a nota do aluno: ");
		nota = input.nextDouble();
		
		maior = menor = nota;

		while (nota > 0) {
			contNotas++;
			soma += nota;
			System.out.print("Digite a quantidade de faltas do aluno: ");
			faltas = input.nextInt();

			if (nota > maior) {
				maior = nota;
			} else if (nota> 00 && nota < menor) {
				menor = nota;
			}
			if (nota >= 90.0) {
				contAcima90++;
			}
			if ((nota < 70.0) || (faltas >= 20)) {
				contReprovado++;
			}

			System.out.print("Digite a nota do aluno: ");
			nota = input.nextDouble();
		}
		System.out.format("Quantidade de alunos com nota 90 ou mais: %d", contAcima90);
		System.out.format("\nQuantidade de reprovados: %d ", contReprovado);
		System.out.format("\nA maior nota da turma foi: %.2f", maior);
		System.out.format("\nA menor nota da turma foi: %.2f", menor);
		System.out.format("\nA média da turma é: %.2f", soma / contNotas++);

		input.close();
	}

}
