package com.dio.tratamentoExcecoes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeituraDeArquivo {

	public static void main(String[] args) {
		/*
		 * Descrição: Escreva um programa que tente ler o conteúdo de um arquivo de
		 * texto fornecido pelo usuário. O programa deve tratar a exceção
		 * FileNotFoundException caso o arquivo não seja encontrado e exibir uma
		 * mensagem de erro apropriada. O programa também deve tratar qualquer outra
		 * exceção inesperada e exibir uma mensagem genérica de erro.
		 */
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Digite o nome do arquivo ");
			String arquivo = scanner.next();

			BufferedReader br = new BufferedReader(new FileReader(arquivo));

			String linha;
			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// Capturar e tratar a exceção de arquivo não encontrado
			System.out.println("Erro: O arquivo '" + e.getMessage() + "' não foi encontrado.");
		} catch (IOException e) {
			// Capturar e tratar outras exceções de E/S
			System.out.println("Erro de entrada/saída: " + e.getMessage());

		} catch (Exception e) {
			// Capturar e tratar qualquer outra exceção inesperada
			System.out.println("Ocorreu um erro: " + e.getMessage());

		} finally {
			System.out.println("Tentativa de leitura do arquivo concluída.");
		}
		scanner.close();

	}

}
