package com.dio.desafio.servicoDeTelefonia;

import java.util.Scanner;

public class VerificacaoServico {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        System.out.println("Digite o serviço a ser verificado:");
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        System.out.println("Digite o nome do cliente e os serviços contratados (separados por vírgula):");
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        @SuppressWarnings("unused")
		String nomeCliente = partes[0].trim();

        boolean contratado = false;
        for (int i = 1; i < partes.length; i++) {
            if (partes[i].trim().equalsIgnoreCase(servico)) {
                contratado = true;
                break;
            }
        }

        // Verificando se o serviço está na lista de serviços contratados
        if (contratado) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }

        scanner.close();
    }
}
