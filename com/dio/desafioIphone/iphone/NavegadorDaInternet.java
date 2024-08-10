package com.dio.desafio.iphone;

public class NavegadorDaInternet implements Iphone {

    @Override
    public void ligar(String numero) { }

    @Override
    public void atender() { }

    @Override
    public void iniciarCorreioDeVoz() { }

    @Override
    public void tocar() { }

    @Override
    public void pausar() { }

    @Override
    public void selecionarMusica(String musica) { }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
