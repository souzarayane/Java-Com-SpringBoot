package com.dio.estruturasCondicionais.Switch;

import java.util.Scanner;

public class MesesDoAno {

	public static void main(String[] args) {
		// Escreva um programa que receba um número de 1 a 12 e exiba o nome do mês
		// correspondente

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 12");

		int mes = scanner.nextInt();

		switch (mes) {
		case 1:
			System.out.println("Mês escolhido " + mes + " janeiro");
			break;
		case 2:
			System.out.println("Mês escolhido " + mes + " fevereiro");
			break;
		case 3:
			System.out.println("Mês escolhido " + mes + " março");
			break;
		case 4:
			System.out.println("Mês escolhido " + mes + " abril");
			break;
		case 5:
			System.out.println("Mês escolhido " + mes + " maio");
			break;
		case 6:
			System.out.println("Mês escolhido " + mes + " junho");
			break;
		case 7:
			System.out.println("Mês escolhido " + mes + " julho");
			break;
		case 8:
			System.out.println("Mês escolhido " + mes + " agosto");
			break;
		case 9:
			System.out.println("Mês escolhido " + mes + " setembro");
			break;
		case 10:
			System.out.println("Mês escolhido " + mes + " outubro");
			break;
		case 11:
			System.out.println("Mês escolhido " + mes + " novembro");
			break;
		case 12:
			System.out.println("Mês escolhido " + mes + " dezembro");
			break;
		default:
			System.out.println("Digite um número de 1 a 12.");
		}

		scanner.close();

	}

}
