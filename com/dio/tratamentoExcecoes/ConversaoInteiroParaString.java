package com.dio.tratamentoExcecoes;

import java.util.Scanner;

public class ConversaoInteiroParaString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Digite um número inteiro: ");
			String input = scanner.nextLine();

			// Tentar converter a string em um número inteiro
			int numero = Integer.parseInt(input);

			// Exibir o número convertido
			System.out.println("Você digitou o número: " + numero);

		} catch (NumberFormatException e) {
			System.out.println("Erro: " + e.getMessage() + " não é um número inteiro válido.");
		} finally {
			System.out.println("Programa finalizado");
		}

		scanner.close();

	}

}
