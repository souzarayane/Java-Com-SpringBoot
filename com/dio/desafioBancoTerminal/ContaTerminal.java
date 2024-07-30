package com.dio.desafioBancoTerminal;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        // To do: Conhecer e importar a classe Scanner
        // Exibir as mensagens para o usuário
        // Obter pela scanner os valores digitados no terminal
        // Exibir a mensagem: conta criada

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu primeiro nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenome: ");
        String sobrenome = scanner.next();
        String nomeCompleto = nome + " " + sobrenome;

        System.out.println("Por favor, digite os 4 dígitos da sua agência: ");
        String agencia = scanner.next();

        // Formatando a agência para o formato 067-8
        String agenciaFormatada = agencia.substring(0, 3) + "-" + agencia.substring(3);

        System.out.println("Por favor, digite o número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da sua conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCompleto + ", obrigado por criar uma conta em nosso banco. Sua agência é "
                + agenciaFormatada + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}