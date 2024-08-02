package com.dio.operadorTernario;

import java.util.Scanner;

public class PrecoComDesconto {

	public static void main(String[] args) {
		//Escreva um programa que receba o preço de um produto e a quantidade comprada. 
		//Use o operador ternário para aplicar um desconto de 10% se a quantidade for maior que 10.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o preço do produto: ");
		double preco = scanner.nextDouble();
		System.out.println("Digite a quantidade do produto: ");
		int quantidade = scanner.nextInt();
		
		double desconto = (quantidade > 10) ? (preco - (preco * 0.1)) * quantidade : (preco * quantidade);
		System.out.println("O total a pagar é R$ " + desconto);
		
		
		scanner.close();
	}

}
