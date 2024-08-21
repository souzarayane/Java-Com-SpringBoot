package com.dio.interfaces.list.exercicios;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

	private List<Tarefas> tarefasList;

	public ListaTarefas() {
		this.tarefasList = new ArrayList<>();
	}

	// Adiciona uma nova tarefa à lista com a descrição fornecida.
	public void adicionarTarefas(String descricao) {
		tarefasList.add(new Tarefas(descricao));
	}
	
	//Remove uma tarefa da lista com base em sua descrição.
	public void removerTarefas(String descricao) {
		tarefasList.remove(0);
	}
	
	//Retorna o número total de tarefas na lista.
	public void obterNumeroTotalTarefas(String descricao) {
		List<Tarefas> tarefasParaRemover = new ArrayList<>();
		
		for(Tarefas t : tarefasList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefasList.removeAll(tarefasParaRemover);
	}
	
	//Retorna o número total de tarefas na lista.
	public int obterNumeroTotalTarefas() {
		return tarefasList.size();
	}
	
	//Retorna uma lista contendo a descrição de todas as tarefas na lista.
	public void obterDescricoesTarefas() {
		System.out.println(tarefasList);
	}
	
	public static void main(String[] args) {
		ListaTarefas listaTarefas = new ListaTarefas();
		System.out.println("O número total de elementos da lista é: " + listaTarefas.obterNumeroTotalTarefas());
		
		listaTarefas.adicionarTarefas("Tarefa 01");
		listaTarefas.adicionarTarefas("Tarefa 02");
		listaTarefas.adicionarTarefas("Tarefa 03");
		System.out.println("O número total de elementos da lista é: " + listaTarefas.obterNumeroTotalTarefas());
		
		listaTarefas.removerTarefas("Tarefa 01");
		System.out.println("O número total de elementos da lista é: " + listaTarefas.obterNumeroTotalTarefas());
		
		listaTarefas.obterDescricoesTarefas();
	}
}
