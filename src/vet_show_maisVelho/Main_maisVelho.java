package vet_show_maisVelho;

import java.util.Locale;
import java.util.Scanner;

public class Main_maisVelho {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, maiorIdade, posicaoMaior;

		System.out.print("Quantas pessoas ira digitar? ");
		n = sc.nextInt();

		String[] nomes = new String[n];
		int[] idades = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}

		maiorIdade = idades[0];
		posicaoMaior = 0;

		for (int i = 0; i < n; i++) {
			if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				posicaoMaior = i;
			}
		}

		sc.nextLine();
		System.out.printf("PESSOAS MAIS VELHAS: %s\n", nomes[posicaoMaior]);

		sc.close();

	}

}
