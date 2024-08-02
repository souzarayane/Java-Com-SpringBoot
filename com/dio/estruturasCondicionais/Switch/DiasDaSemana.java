package com.dio.estruturasCondicionais.Switch;

import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {
		
		//Escreva um programa que receba um número de 1 a 7 e exiba o dia da semana correspondente
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 7: ");
		int dia = scanner.nextInt();
		
		switch(dia) {
		case 1:
			System.out.println("Dia escolhindo: " + dia + " Domingo");
		break;
		case 2:
			System.out.println("Dia escolhido: " + dia + " Segunda-feira");
			break;
		case 3:
			System.out.println("Dia escolhido: " + dia + " Terça-feira");
			break;
		case 4:
			System.out.println("Dia escolhido: " + dia + " Quarta-feira");
		case 5: 
			System.out.println("Dia escolhido: " + dia + " Quinta-feira");
			break;
		case 6:
			System.out.println("Dia escolhido: " + dia + " Sexta-feira");
			break;
		case 7:
			System.out.println("Dia escolhido: " + dia + " Sábado");
			break;
			default:
				System.out.println("Digite um número de 1 a 7");
		}
		
		scanner.close();

	}

}
