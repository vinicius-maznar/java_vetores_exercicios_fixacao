package vet_show_porcentagem_de;

import java.util.Locale;
import java.util.Scanner;

public class Main_vet_porcentagem_de_v1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao inseridas? ");
		int N = sc.nextInt();

		String[] nome = new String[N];
		int[] idade = new int[N];
		double[] altura = new double[N];

		for (int i = 0; i < N; i++) {
			System.out.printf("Dados da %da pessoa: ", i + 1);
			System.out.print("\nNome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();

		}

		int numMenores = 0;
		double alturaTotal = 0.0;

		for (int i = 0; i < idade.length; i++) {
			if (idade[i] < 16) {
				numMenores++;
			}
			alturaTotal = alturaTotal + altura[i];
		}

		double alturaMedia = alturaTotal / N;
		double percentualMenores = ((double) numMenores / N) * 100;

		System.out.printf("\nAltura Media: %.2f", alturaMedia);
		System.out.println("\nPessoas com menos de 16 anos: " + percentualMenores + "%");

		for (int i = 0; i < N; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}

		sc.close();

	}

}
