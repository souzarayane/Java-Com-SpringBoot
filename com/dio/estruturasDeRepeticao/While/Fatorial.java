package com.dio.estruturasDeRepeticao.While;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		/*
		 * Descrição: Escreva um programa que 
		 * leia um número inteiro positivo e calcule o fatorial desse número.
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro positivo: ");
		int numero = scanner.nextInt();
		int fatorial = 1;
		int i = 1;
		
		while(i <= numero ) {
			fatorial *= i;
			i++;
		}
		
		System.out.println("O fatorial de " + numero + " é " + fatorial);
		scanner.close();
	}

}
