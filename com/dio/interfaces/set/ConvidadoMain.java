package com.dio.set;

public class ConvidadoMain {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados.");
        conjuntoConvidados.adicionarConvidado("Convidado 1", 123456);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 123987);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 128756);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 541456);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 541456);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados.");
        
        conjuntoConvidados.removerConvidadoPorCodigoConvite(128756);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados.");
        
        conjuntoConvidados.exibirConvidados();
    }
}
