package com.dio.desafio.iphone;

public class AparelhoTelefonico implements Iphone {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void tocar() { }

    @Override
    public void pausar() { }

    @Override
    public void selecionarMusica(String musica) { }

    @Override
    public void exibirPagina(String url) { }

    @Override
    public void adicionarNovaAba() { }

    @Override
    public void atualizarPagina() { }
}
