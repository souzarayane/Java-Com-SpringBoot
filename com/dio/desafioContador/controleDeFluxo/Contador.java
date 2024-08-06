package com.dio.desafio.controleDeFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int parametro1 = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int parametro2 = scanner.nextInt();

		try {
			// Chamada contendo a lógica da contagem
			contar(parametro1, parametro2);
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior do que o primeiro.");
		}

		scanner.close();
	}

	static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
		// Validar se parametro1 é maior do que parametro2 e lançar a exceção
		if (parametro1 >= parametro2) {
			throw new ParametrosInvalidosException();
		}

		// Calcular a contagem
		int contagem = parametro2 - parametro1;

		// Realizar o for para imprimir os números com base na variável contagem
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}

// Definindo a exceção ParametrosInvalidosException
@SuppressWarnings("serial")
class ParametrosInvalidosException extends Exception {
}
