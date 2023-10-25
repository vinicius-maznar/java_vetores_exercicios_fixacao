/*
 
Problema "negativos"

	# 	Faça um programa que leia 
		um número inteiro positivo N (máximo = 10) 
		depois N números inteiros e armazene-os em um vetor. 
		Em seguida, mostrar na tela todos os números negativos lidos. 
 
 */

package vet_show_numNegativos;

import java.util.Locale;
import java.util.Scanner;

public class Main_vet_numNegativo_v1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros irá digitar: ");
		int N = sc.nextInt();
		int[] vetorNumeros = new int[N];
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vetorNumeros[i] = sc.nextInt();
		}

		System.out.println("NUMEROS NEGATIVOS: ");
		for (int i = 0; i < vetorNumeros.length; i++) {
			if (vetorNumeros[i] < 0) {
				System.out.println(vetorNumeros[i]);
			}

		}

		sc.close();

	}

}
