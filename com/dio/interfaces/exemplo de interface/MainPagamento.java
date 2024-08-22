package com.dio.interfaces;

public class MainPagamento {
    public static void main(String[] args) {
        // Exemplo de pagamento via PIX
        PagamentoPix pagamentoPix = new PagamentoPix();
        pagamentoPix.setChavePix("email@example.com");
        
        if (pagamentoPix.processarPagamento(100.00)) {
            System.out.println("Pagamento PIX realizado com sucesso.");
            System.out.println(pagamentoPix.gerarRecibo());
        } else {
            System.out.println("Falha ao processar pagamento PIX.");
        }

        // Exemplo de pagamento via Cartão
        PagamentoCartao pagamentoCartao = new PagamentoCartao();
        pagamentoCartao.setNumeroCartao("1234 5678 9012 3456");
        pagamentoCartao.setNomeTitular("João Silva");
        pagamentoCartao.setDataValidade("12/25");
        pagamentoCartao.setCodigoSeguranca("123");

        if (pagamentoCartao.processarPagamento(250.00)) {
            System.out.println("Pagamento com cartão realizado com sucesso.");
            System.out.println(pagamentoCartao.gerarRecibo());
        } else {
            System.out.println("Falha ao processar pagamento com cartão.");
        }

        // Exemplo de pagamento via Boleto
        PagamentoBoleto pagamentoBoleto = new PagamentoBoleto();
        
        if (pagamentoBoleto.processarPagamento(500.00)) {
            System.out.println("Boleto gerado com sucesso.");
            System.out.println("Número do boleto: " + pagamentoBoleto.getNumeroBoleto());
            System.out.println("Data de vencimento: " + pagamentoBoleto.getDataVencimento());
            System.out.println(pagamentoBoleto.gerarRecibo());
            
            // Simulando o pagamento do boleto
            pagamentoBoleto.pagarBoleto();
            System.out.println("Status do pagamento: " + pagamentoBoleto.obterStatusPagamento());
        } else {
            System.out.println("Falha ao gerar o boleto.");
        }
    }
}
