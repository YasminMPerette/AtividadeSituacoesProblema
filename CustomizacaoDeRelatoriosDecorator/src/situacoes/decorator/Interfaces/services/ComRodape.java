package situacoes.decorator.services;

import situacoes.decorator.Interfaces.Relatorio;

public class ComRodape implements Relatorio {
    private Relatorio relatorio;

    public ComRodape(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public String gerar() {
        return relatorio.gerar() + "\nRodapé: confidencial";
    }
}
