package com.dio.estruturasCondicionais.Switch;

import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// Escreva um programa que receba dois números e um operador (+, -, *, /) e
		// realize a operação correspondente.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int numero1 = scanner.nextInt();
		System.out.println("Digite um número inteiro: ");
		int numero2 = scanner.nextInt();
		System.out.println("Digite um operador aritmético: + , - , * , /");
		char operador = scanner.next().charAt(0);

		switch (operador) {
		case '+':
			System.out.println("Resultado " + (numero1 + numero2));
			break;
		case '-':
			System.out.println("Resultado " + (numero1 - numero2));
			break;
		case '*':
			System.out.println("Resultado " + (numero1 * numero2));
			break;
		case '/':
			System.out.println("Resultado " + (numero1 / numero2));
			break;
		default:
			System.out.println("Escolha um operador válido.");
		}

		scanner.close();

	}

}
