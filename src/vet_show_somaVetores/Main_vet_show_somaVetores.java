package vet_show_somaVetores;

import java.util.Locale;
import java.util.Scanner;

public class Main_vet_show_somaVetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores tera cada vetor: ");
		int N = sc.nextInt();
		int[] vetA = new int[N];
		int[] vetB = new int[N];
		int[] vetC = new int[N];

		System.out.println("Quantos valores tera cada vetor: ");
		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < N; i++) {
			vetA[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < N; i++) {
			vetB[i] = sc.nextInt();
			vetC[i] = vetA[i] + vetB[i];
		}

		System.out.println("VETOR RESULTANTE: ");
		for (int i = 0; i < N; i++) {
	    	System.out.printf("%d\n", vetC[i]);
		}

		sc.close();

	}

}
