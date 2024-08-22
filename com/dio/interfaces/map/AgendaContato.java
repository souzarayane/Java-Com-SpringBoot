package com.dio.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String, Integer> agendaContatoMap;

    // Constructor that initializes the map
    public AgendaContato(Map<String, Integer> agendaContatoMap) {
        this.agendaContatoMap = agendaContatoMap != null ? agendaContatoMap : new HashMap<>();
    }

    // Method to add a contact
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    // Method to remove a contact by name
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    // Method to display all contacts
    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    // Method to search for a contact by name
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorPessoa = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorPessoa = agendaContatoMap.get(nome);
        }
        return numeroPorPessoa;
    }

    public static void main(String[] args) {
        // Correct initialization using the correct class name
        AgendaContato agendaContato = new AgendaContato(new HashMap<>());

        agendaContato.adicionarContato("Camila Dinossaura", 123654);
        agendaContato.adicionarContato("Camila Pitomba", 123854);
        agendaContato.adicionarContato("Camila DIO", 123789);
        agendaContato.adicionarContato("Camila Silva", 129854);
        agendaContato.adicionarContato("Camila Cacilda", 128754);

        // Display all contacts
        agendaContato.exibirContato();
        agendaContato.removerContato("Camila DIO");
        agendaContato.exibirContato();

        System.out.println("O número é: " + agendaContato.pesquisarPorNome("Camila Silva"));
    }
}
