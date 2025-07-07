package situacoes.decorator.services;

import situacoes.decorator.Interfaces.Relatorio;

public class ComCabecalho implements Relatorio {
    private Relatorio relatorio;

    public ComCabecalho(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public String gerar() {
        return "Cabeçalho: Relatório do Sistema\n" + relatorio.gerar();
    }
}
