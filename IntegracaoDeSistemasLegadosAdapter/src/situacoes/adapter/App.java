package situacoes.adapter;

import situacoes.adapter.Interfaces.Pagador;

public class App {
    private Pagador pagador;

    public App(Pagador pagador) {
        this.pagador = pagador;
    }

    public void efetuarPagamento(double valor) {
        pagador.pagar(valor);
    }
}
