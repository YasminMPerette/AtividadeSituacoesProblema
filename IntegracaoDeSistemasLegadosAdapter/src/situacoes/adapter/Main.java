package situacoes.adapter;

import situacoes.adapter.services.NovoPagamentoAPI;
import situacoes.adapter.services.PagamentoAdapter;

public class Main {
    public static void main(String[] args) {
        NovoPagamentoAPI novoServico = new NovoPagamentoAPI();
        PagamentoAdapter adapter = new PagamentoAdapter(novoServico);

        App sistema = new App(adapter);
        sistema.efetuarPagamento(250.00);
    }
}
