package vet_show_mediaPares;

import java.util.Locale;
import java.util.Scanner;

public class Main_mediaPares_v1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, somaPares = 0, nPares = 0;
		double mediaPares;
		
		System.out.print("Quantos elementos tera o vetor? ");
		n = sc.nextInt();
		
		int[] vetNum = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite uma numero: ");
			vetNum[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if (vetNum[i] % 2 == 0) {
				somaPares = somaPares + vetNum[i];
				nPares++;
			}
		}
		
		if (nPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			mediaPares = (double)somaPares / nPares;
			System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares);
		}
		
		
		sc.close();
	}

}
