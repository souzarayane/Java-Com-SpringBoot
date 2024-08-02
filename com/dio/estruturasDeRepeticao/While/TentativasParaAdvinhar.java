package com.dio.estruturasDeRepeticao.While;

import java.util.Random;
import java.util.Scanner;

public class TentativasParaAdvinhar {

	public static void main(String[] args) {
		/*
		 * Descrição: Escreva um programa que escolha um número aleatório entre 1 e 100.
		 * Peça ao usuário para adivinhar o número e forneça feedback se a adivinhação
		 * está muito alta ou muito baixa. O programa deve continuar até que o usuário
		 * adivinhe o número corretamente e, em seguida, exibir o número de tentativas
		 * necessárias.
		 */
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int numeroAleatorio = random.nextInt(100) + 1;
		int palpite;
		int tentativas = 0;

		System.out.println("Advinhe o número aleatório entre 1 e 100");

		while (true) {
			palpite = scanner.nextInt();
			tentativas++;
			if (palpite == numeroAleatorio) {
				break;
			} else if (palpite > numeroAleatorio) {
				System.out.println("Muito alto! Tente novamente.");
			} else {
				System.out.println("Muito baixo! Tente novamente.");
			}
		}

		System.out.println("Parabén você acertou o número aleatório em " + tentativas + " tentativas.");

		scanner.close();

	}

}
