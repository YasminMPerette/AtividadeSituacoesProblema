package situacoes.decorator.services;

import situacoes.decorator.Interfaces.Relatorio;

public class RelatorioSimples implements Relatorio {
    @Override
    public String gerar() {
        return "Relatório base";
    }
}
