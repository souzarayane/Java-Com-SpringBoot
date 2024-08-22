package com.dio.interfaces;

import java.util.Date;
import java.util.Calendar;

public class PagamentoBoleto implements Pagamento {
	private String numeroBoleto;
	private Date dataVencimento;
	private double valor;
	private double multa;
	private boolean pago;

	@Override
	public boolean processarPagamento(double valor) {
		this.valor = valor;
		gerarBoleto();
		return true; // Retorna true, pois a geração do boleto foi bem-sucedida
	}

	@Override
	public boolean validarDados() {
		// Validação básica, como verificar se o número do boleto foi gerado
		return numeroBoleto != null && dataVencimento != null;
	}

	@Override
	public double calcularTaxa(double valor) {
		// Taxa fixa ou percentual para a emissão do boleto
		return valor * 0.03; // Exemplo: 3% de taxa sobre o valor do boleto
	}

	@Override
	public String gerarRecibo() {
		if (pago) {
			return "Recibo: Pagamento do boleto número " + numeroBoleto + " no valor de R$ " + valor
					+ " foi realizado com sucesso.";
		} else {
			return "Recibo: Boleto número " + numeroBoleto + " no valor de R$ " + valor
					+ " gerado. Aguardando pagamento.";
		}
	}

	@Override
	public boolean cancelarPagamento() {
		if (!pago) {
			this.numeroBoleto = null;
			this.dataVencimento = null;
			this.valor = 0;
			return true; // O boleto foi cancelado com sucesso
		}
		return false; // Não pode cancelar se o boleto já foi pago
	}

	@Override
	public String obterStatusPagamento() {
		return pago ? "Pago" : "Aguardando pagamento";
	}

	// Métodos Específicos para Boleto

	private void gerarBoleto() {
		this.numeroBoleto = "BOLETO-" + Math.random(); // Gera um número de boleto fictício
		this.dataVencimento = calcularDataVencimento();
		this.multa = calcularMulta();
		this.pago = false;
		// Lógica para salvar o boleto no sistema ou enviá-lo ao cliente
	}

	private Date calcularDataVencimento() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 7); // Define o vencimento para 7 dias após a geração
		return cal.getTime();
	}

	private double calcularMulta() {
		// Multa fixa para pagamento após a data de vencimento
		return valor * 0.02; // 2% de multa
	}

	public void pagarBoleto() {
		this.pago = true;
	}

	public String getNumeroBoleto() {
		return numeroBoleto;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public double getMulta() {
		return multa;
	}
}
