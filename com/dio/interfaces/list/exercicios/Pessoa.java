package com.dio.interfaces.list.exercicios;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{

	private String nome;
	private int idade;
	private double altura;

	public Pessoa(String nome, int idade, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
	}
	
	public int compareTo(Pessoa p) {
		return Integer.compare(idade, p.getIdade());
	}
}

class ComparatorPorAltura implements Comparator<Pessoa>{
	public int compare(Pessoa p1, Pessoa p2) {
		return Double.compare(p1.getAltura(), p2.getAltura());
	}
	
	
}
