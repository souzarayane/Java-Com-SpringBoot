package com.dio.interfaces.list.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	
	private List<Pessoa> pessoaList;
	
	public OrdenacaoPessoas() {
		this.pessoaList = new ArrayList<>();
	}
	
	//Adiciona uma pessoa à lista.
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	//Ordena as pessoas da lista por idade usando a interface Comparable.
	public List<Pessoa> ordenadoPorIdade(){
		List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);	
		Collections.sort(pessoaPorIdade);
		return pessoaPorIdade;
	}
	
	//Ordena as pessoas da lista por altura usando um Comparator personalizado.
	public List<Pessoa> ordenadoPorAltura(){
		List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
		return pessoaPorAltura;
	}
}
