package vet_show_soma_media;

import java.util.Locale;
import java.util.Scanner;

public class Main_vet_soma_media_v1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros irá digitar: ");
		int N = sc.nextInt();
		double[] vetorNum = new double[N];
		double soma = 0.0;

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vetorNum[i] = sc.nextDouble();
			soma += vetorNum[i];
		}

		double media = soma / N;
		System.out.println();
		System.out.print("VALORES: ");
		for (int i = 0; i < vetorNum.length; i++) {
			System.out.printf("%.1f ", vetorNum[i]);
		}
		System.out.println("\nSOMA = " + soma);
		System.out.println("MEDIA = " + media);

		sc.close();

	}

}
