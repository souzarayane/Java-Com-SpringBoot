package com.dio.tratamentoExcecoes;

import java.util.Scanner;

public class DivisaocomExcecao {

	public static void main(String[] args) {

		/*
		 * Descrição: Escreva um programa que solicite ao usuário dois números inteiros
		 * e divida o primeiro pelo segundo. O programa deve tratar a exceção de divisão
		 * por zero e exibir uma mensagem de erro adequada.
		 */
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Digite o primeiro número: ");
			double numero1 = scanner.nextDouble();
			System.out.println("Digite o segundo número: ");
			double numero2 = scanner.nextDouble();

			if (numero2 == 0) {
				System.out.println("Erro: Divisão por zero não é permitida.");
			} else {
				double resultado = numero1 / numero2;
				System.out.println("O resultado da divisão é: " + resultado);
			}

		} catch (ArithmeticException e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		} finally {
			System.out.println("Programa executado com sucesso!");
		}

		scanner.close();
	}

}
