package com.dio.interfaces;

public class PagamentoCartao implements Pagamento {
    private String numeroCartao;
    private String nomeTitular;
    private String dataValidade;
    private String codigoSeguranca;
    private double limiteDisponivel;
	private double valor;

    @Override
    public boolean processarPagamento(double valor) {
        if (validarDados() && verificarLimiteDisponivel(valor) && autorizarTransacao()) {
            registrarTransacao(valor);
            return true;
        }
        return false;
    }

    @Override
    public boolean validarDados() {
        // Validação básica dos dados do cartão
        return numeroCartao != null && nomeTitular != null && dataValidade != null && codigoSeguranca != null;
    }

    @Override
    public double calcularTaxa(double valor) {
        // Exemplo: 2% de taxa sobre o valor da compra
        return valor * 0.02;
    }

    @Override
    public String gerarRecibo() {
        return "Recibo: Pagamento com cartão de R$ " + valor + " realizado com sucesso.";
    }

    @Override
    public boolean cancelarPagamento() {
        // Logicamente, o cancelamento dependeria das políticas da operadora do cartão
        return false;
    }

    @Override
    public String obterStatusPagamento() {
        return "Concluído"; // Exemplo de status
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao() {
        return this.numeroCartao;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return this.dataValidade;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public String getCodigoSeguranca() {
        return this.codigoSeguranca;
    }

    public boolean verificarLimiteDisponivel(double valor) {
        return valor <= this.limiteDisponivel;
    }

    private boolean autorizarTransacao() {
        // Simulação de autorização com a operadora do cartão
        return true;
    }

    private void registrarTransacao(double valor) {
        this.limiteDisponivel -= valor;
    }
}