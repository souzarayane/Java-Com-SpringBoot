package com.dio.operadorTernario;

import java.util.Scanner;

public class AvaliacaoDeNota {

	public static void main(String[] args) {
		//Escreva um programa que receba uma nota de 0 a 100 e use o operador ternário para determinar se a nota é "Aprovado" (nota maior ou igual a 60) ou "Reprovado" (nota menor que 60).
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma nota de 0 a 100.");
		int nota = scanner.nextInt();
		
		String resultado = (nota >= 60) ? "Aprovado" : "Reprovado";
		System.out.println("Sua nota é " + nota + ". Você está " + resultado + ".");
		
		scanner.close();

	}

}
