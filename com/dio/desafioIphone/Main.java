package com.dio.desafio.iphone;

public class Main {

	public static void main(String[] args) {
		
		//Instâncias das Classes
		AparelhoTelefonico iphone = new AparelhoTelefonico();
		ReprodutorMusical ipad = new ReprodutorMusical();
		NavegadorDaInternet safari = new NavegadorDaInternet();
		
		//Testando a Classe AparelhoTelefonico
		System.out.println("*************Testando Aparelho Telefônico*************");
		iphone.ligar("1234-7896");
		iphone.atender();
		iphone.iniciarCorreioDeVoz();
		
		//Testando a Classe ReprodutorMusical
		System.out.println("*************Testando Reprodutor Musical*************");
		ipad.selecionarMusica("Believer - Imagine Dragon");
		ipad.tocar();
		ipad.pausar();
		
		//Testando a Classe NavedagorInternet
		System.out.println("*************Testando Reprodutor Musical*************");
		safari.exibirPagina("http://www.google.com");
		safari.adicionarNovaAba();
		safari.atualizarPagina();

	}

}
