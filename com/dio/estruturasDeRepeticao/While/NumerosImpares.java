package com.dio.estruturasDeRepeticao.While;

public class NumerosImpares {

	public static void main(String[] args) {
		/*
		 * Descrição: Escreva um programa que imprima todos os números ímpares de 1 a 50.
		 */

		int numero = 0;
		
		while(numero <= 50) {
			if(numero % 2 != 0) {
				System.out.println(numero);
			}
			numero++;
		}
	}

}

