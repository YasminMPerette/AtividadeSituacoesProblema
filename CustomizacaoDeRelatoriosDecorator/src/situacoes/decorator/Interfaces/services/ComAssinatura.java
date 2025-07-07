package situacoes.decorator.services;

import situacoes.decorator.Interfaces.Relatorio;

public class ComAssinatura implements Relatorio {
    private Relatorio relatorio;

    public ComAssinatura(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public String gerar() {
        return relatorio.gerar() + "\nAssinado por: Diretor";
    }
}
