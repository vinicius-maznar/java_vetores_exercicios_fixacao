package vet_show_aprovados;

import java.util.Locale;
import java.util.Scanner;

public class Main_Aprovados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");

		int n = sc.nextInt();
		double media;

		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
			nome[i] = sc.nextLine();
			sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}

		System.out.println("Alunos aprovados: ");

		for (int i = 0; i < n; i++) {
			media = (nota1[i] + nota2[i]) / 2;
			if (media >= 6.0) {
				System.out.printf("%s\n", nome[i]);
			}

			sc.close();

		}
	}
}
