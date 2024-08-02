package com.dio.tratamentoExcecoes;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EntradaDeData {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false); // Desabilita a leniência para que datas inválidas gerem exceção

		try {
			// Solicitar ao usuário que insira uma data
			System.out.print("Digite uma data no formato dd/MM/yyyy: ");
			String input = scanner.nextLine();

			// Tentar converter a string em um objeto Date
			Date data = sdf.parse(input);

			// Exibir a data convertida
			System.out.println("Você digitou a data: " + sdf.format(data));

		} catch (ParseException e) {
			// Capturar e tratar a exceção de formato de data inválido
			System.out.println(
					"Erro: A data '" + e.getMessage() + "' não é válida. Por favor, use o formato dd/MM/yyyy.");

		} finally {
			// Mensagem final indicando que o programa foi concluído
			System.out.println("Programa concluído.");
		}

		scanner.close();

	}

}
