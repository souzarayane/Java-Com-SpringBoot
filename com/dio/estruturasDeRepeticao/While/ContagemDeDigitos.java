package com.dio.estruturasDeRepeticao.While;

import java.util.Scanner;

public class ContagemDeDigitos {

	public static void main(String[] args) {
		/*
		 * Descrição: Escreva um programa que leia um número inteiro positivo e conte o
		 * número de dígitos desse número.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número inteiro positivo: ");
		int numero = scanner.nextInt();
		int contagem = 0;

		while (numero > 0) {
			numero /= 10;
			contagem++;
		}

		System.out.println("O número de dígitos é: " + contagem);

		scanner.close();

	}

}
