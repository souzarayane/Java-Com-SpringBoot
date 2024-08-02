package com.dio.estruturasCondicionais.Switch;

import java.util.Scanner;

public class AvaliacaoDeNotas {

	public static void main(String[] args) {
		// Escreva um programa que receba uma nota de 0 a 10 e exiba o conceito
		// correspondente (A, B, C, D, F).

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma nota de 1 a 10: ");
		int nota = scanner.nextInt();

		switch (nota) {
		case 10:
		case 9:
			System.out.println("Conceito A");
			break;
		case 8:
		case 7:
			System.out.println("Conceito B");
			break;
		case 6:
		case 5:
			System.out.println("Conceito C");
			break;
		case 4:
		case 3:
			System.out.println("Conceito D");
			break;
		case 2:
		case 1:
		case 0:
			System.out.println("Conceito F");
			break;
		default:
			System.out.println("Digite um número de 1 a 10.");

		}

		scanner.close();

	}

}
