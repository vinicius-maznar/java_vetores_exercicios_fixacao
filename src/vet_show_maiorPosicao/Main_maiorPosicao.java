/*
 
PROBLEMA "MAIOR POSICAO":

	#	Faça um programa que leia N números reais 
		e armazene-os em um vetor. Em seguida, mostrar na tela
		o maior número do vetor (supor não haver empates). 
		Mostrar também a posição do maior elemento,
		considerando a primeira posição como 0 (zero). 
 
 */

package vet_show_maiorPosicao;

import java.util.Locale;
import java.util.Scanner;

public class Main_maiorPosicao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros ira digitar? ");
		int N = sc.nextInt();

		double[] numVetor = new double[N];

		int posicMaior = 0;
		double maior = numVetor[0];

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			numVetor[i] = sc.nextDouble();

			if (numVetor[i] > maior) {
				maior = numVetor[i];
				posicMaior = i;
			}
		}

		System.out.printf("\nMAIOR VALOR: %.1f%n", maior);
		System.out.println("POSICAO DO MAIOR VALOR: " + posicMaior);

		sc.close();

	}

}
