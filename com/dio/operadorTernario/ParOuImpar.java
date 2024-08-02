package com.dio.operadorTernario;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		// Escreva um programa que receba um número inteiro e use o operador ternário
		// para verificar se o número é par ou ímpar.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();

		String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
		System.out.println("O número " + numero + " é " + resultado);

		scanner.close();
	}

}
