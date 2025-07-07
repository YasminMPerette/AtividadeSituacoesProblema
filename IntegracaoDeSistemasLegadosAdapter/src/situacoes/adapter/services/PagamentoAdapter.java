package situacoes.adapter.services;

import situacoes.adapter.Interfaces.Pagador;

public class PagamentoAdapter implements Pagador {
    private NovoPagamentoAPI novoPagamento;

    public PagamentoAdapter(NovoPagamentoAPI novoPagamento) {
        this.novoPagamento = novoPagamento;
    }

    @Override
    public void pagar(double valor) {
        novoPagamento.realizarTransacao(valor);
    }
}
