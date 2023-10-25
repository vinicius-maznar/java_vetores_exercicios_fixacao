/*
 
PROBLEMA "NUMEROS PARES":

	# 	Faça um programa que leia N números inteiros 
		e armazene-os em um vetor. Em seguida, 
		mostre na tela todos os números pares, 
		e também a quantidade de números pares.
 
 */

package vet_show_numPares;

import java.util.Locale;
import java.util.Scanner;

public class Main_vet_show_numPares_v1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int soma = 0;

		System.out.print("Quantos numeros ira digitar? ");
		int N = sc.nextInt();

		int[] numVetor = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			numVetor[i] = sc.nextInt();

			if (numVetor[i] % 2 == 0) {
				soma += 1;
			}
		}

		System.out.println("\nNUMEROS PARES: ");
		for (int i = 0; i < numVetor.length; i++) {
			if (numVetor[i] % 2 == 0) {
				System.out.print(numVetor[i] + " ");
			}

		}
		System.out.println();
		System.out.println("\nQUANTIDADE DE PARES = " + soma);

		sc.close();

	}

}
