package com.dio.interfaces;

public interface Pagamento {
	
	boolean processarPagamento(double valor);
	boolean validarDados();
	double calcularTaxa(double valor);
	String gerarRecibo();
	boolean cancelarPagamento();
	String obterStatusPagamento();

}
