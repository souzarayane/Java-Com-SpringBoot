package com.dio.set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    // Adiciona um contato à agenda.
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    // Exibir todos os contatos
    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    // Pesquisar por nome
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    // Atualizar o número de um contato existente
    public Contato atualizarNumeroContato(String nome, int numero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(numero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 0);
        agendaContatos.adicionarContato("Camila Cavalcante", 111111111);
        agendaContatos.adicionarContato("Camila DIO", 19998746);
        agendaContatos.adicionarContato("Maria Silva", 99987456);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Camila"));
        System.out.println("Contato atualizado "  + agendaContatos.atualizarNumeroContato("Maria Silva", 555555555));
    }
}
