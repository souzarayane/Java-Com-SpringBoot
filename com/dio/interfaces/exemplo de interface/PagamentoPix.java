package com.dio.interfaces;

public class PagamentoPix implements Pagamento {
    
    private String chavePix;
    private double valor;
    private boolean pago; // Para controlar o status de pagamento
    
    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
    
    public String getChavePix() {
        return this.chavePix;
    }
    
    private boolean conectarBanco() {
        // Lógica para conectar ao banco (simulada)
        return true;
    }
    
    @Override
    public boolean processarPagamento(double valor) {
        this.valor = valor;
        if (conectarBanco()) {
            this.pago = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean validarDados() {
        // Simulação de validação dos dados
        return this.chavePix != null && !this.chavePix.isEmpty();
    }

    @Override
    public double calcularTaxa(double valor) {
        // Exemplo de cálculo de taxa de 1%
        return valor * 0.01;
    }

    @Override
    public String gerarRecibo() {
        if (this.pago) {
            return "Você fez um PIX de R$ " + this.valor;
        } else {
            return "O pagamento não foi concluído.";
        }
    }

    @Override
    public boolean cancelarPagamento() {
        if (this.pago) {
            this.pago = false;
            return true;
        }
        return false;
    }

    @Override
    public String obterStatusPagamento() {
        return this.pago ? "Concluído" : "Pendente";
    }
}
