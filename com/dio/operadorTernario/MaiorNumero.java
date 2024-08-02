package com.dio.operadorTernario;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero1 = scanner.nextInt();
		System.out.println("Digite um número: ");
		int numero2 = scanner.nextInt();

		int maiorNumero = (numero1 > numero2) ? numero1 : numero2;
		System.out.println("O maior número é: " + maiorNumero);

		scanner.close();

	}

}
