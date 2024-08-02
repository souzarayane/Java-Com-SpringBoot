package com.dio.estruturasCondicionais.Switch;

import java.util.Scanner;

public class EstacoesDoAno {

	public static void main(String[] args) {
		// Escreva um programa que receba um número de 1 a 4 e exiba a estação do ano
		// correspondente (1 para Primavera, 2 para Verão, etc.).
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 4: ");
		int estacao = scanner.nextInt();

		switch (estacao) {
		case 1:
			System.out.println("Primavera");
			break;
		case 2:
			System.out.println("Verão");
			break;
		case 3:
			System.out.println("Inverno");
			break;
		case 4:
			System.out.println("Outono");
			break;
		default:
			System.out.println("Digite um número de 1 a 4.");
		}

		scanner.close();

	}

}
