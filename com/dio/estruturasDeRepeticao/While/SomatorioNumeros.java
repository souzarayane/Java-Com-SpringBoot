package com.dio.estruturasDeRepeticao.While;

import java.util.Scanner;

public class SomatorioNumeros {

	public static void main(String[] args) {
		// Descrição: Escreva um programa que leia números inteiros do usuário até que
		// um número negativo seja inserido.
		// O programa deve então exibir a soma de todos os números positivos inseridos.

		Scanner scanner = new Scanner(System.in);
		int soma = 0;
		int numero;

		System.out.println("Digite um número inteiro e positivo para continuar ou "
				+ "digite um número negativo para interromper o programa.");

		while (true) {
			numero = scanner.nextInt();
			if (numero < 0) {
				break;
			}
			soma += numero;
		}

		System.out.println("A soma dos número positivos é de " + soma);

		scanner.close();

	}

}
