package com.dio.desafio.iphone;

public class ReprodutorMusical implements Iphone {

    @Override
    public void ligar(String numero) { }

    @Override
    public void atender() { }

    @Override
    public void iniciarCorreioDeVoz() { }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    @Override
    public void exibirPagina(String url) { }

    @Override
    public void adicionarNovaAba() { }

    @Override
    public void atualizarPagina() { }
}
