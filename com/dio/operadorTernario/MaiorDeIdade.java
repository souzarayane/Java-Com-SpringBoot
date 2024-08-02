package com.dio.operadorTernario;

import java.util.Scanner;

public class MaiorDeIdade {

	public static void main(String[] args) {
		// Escreva um programa que receba a idade de uma pessoa e use o operador
		// ternário para verificar se a pessoa é maior de idade (18 anos ou mais).
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor, digite sua idade: ");
		int idade = scanner.nextInt();

		String resultado = (idade >= 18) ? "maior de idade" : "menor de idade";
		System.out.println("Sua idade é de " + idade + " anos. Você é " + resultado + ".");

		scanner.close();

	}

}
