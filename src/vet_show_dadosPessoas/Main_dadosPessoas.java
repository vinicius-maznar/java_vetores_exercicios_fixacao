package vet_show_dadosPessoas;

import java.util.Locale;
import java.util.Scanner;

public class Main_dadosPessoas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, homens = 0, mulheres = 0;
		double menorAltura = 0.0, maiorAltura = 0.0, somaMedia = 0.0, media;

		System.out.print("Quantas pessoas serão inseridas: ");
		n = sc.nextInt();

		double[] alturas = new double[n];
		char[] generos = new char[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			alturas[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			generos[i] = sc.next().charAt(0);
		}

		menorAltura = alturas[0];
		maiorAltura = alturas[0];

		for (int i = 0; i < n; i++) {
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
			
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
		}

		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		
		for (int i = 0; i < n; i++) {
			if (generos[i] == 'F') {
				somaMedia += alturas[i];
				mulheres += 1;
			}
			else {
				homens += 1;
			}
		}
		
		media = somaMedia / mulheres;
		System.out.printf("Media das alturas das mulheres = %.2f\n", media);
		System.out.println("Numero de homens = " + homens);
		
		sc.close();

	}

}
