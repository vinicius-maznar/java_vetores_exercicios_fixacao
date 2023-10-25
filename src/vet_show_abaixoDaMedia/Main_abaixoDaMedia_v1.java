package vet_show_abaixoDaMedia;

import java.util.Locale;
import java.util.Scanner;

public class Main_abaixoDaMedia_v1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos tera o vetor: ");
		int N = sc.nextInt();

		double soma = 0;
		double media;
		double[] vetNum = new double[N];

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vetNum[i] = sc.nextDouble();
		}

		for (int i = 0; i < vetNum.length; i++) {
			soma = soma + vetNum[i];
		}

		media = soma / N;
		System.out.printf("\nMEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

		for (int i = 0; i < vetNum.length; i++) {
			if (vetNum[i] < media) {
				System.out.printf("%.1f%n", vetNum[i]);
			}
		}

		sc.close();

	}

}
