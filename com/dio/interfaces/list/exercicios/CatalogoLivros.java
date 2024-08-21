package com.dio.interfaces.list.exercicios;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	private List<Livro> livroList;

	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}

	public void adicionarLivros(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livroPorAutor = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					livroPorAutor.add(l);
				}
			}
		}
		return livroPorAutor;
	}

	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAnos.add(l);
				}
			}
		}
		return livrosPorIntervaloAnos;
	}

	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}

	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		catalogoLivros.adicionarLivros("Livro 1", "Autor 1", 1999);
		catalogoLivros.adicionarLivros("Livro 2", "Autor 2", 2000);
		catalogoLivros.adicionarLivros("Livro 3", "Autor 3", 2025);
		catalogoLivros.adicionarLivros("Livro 4", "Autor 4", 1989);
		catalogoLivros.adicionarLivros("Livro 5", "Autor 5", 1990);

		System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
		System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1990, 2000));
		System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
	}
}
