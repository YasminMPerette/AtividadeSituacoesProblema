package situacoes.decorator;

import situacoes.decorator.Interfaces.Relatorio;
import situacoes.decorator.services.*;

public class Main {
    public static void main(String[] args) {

        // Relatório base
        Relatorio simples = new RelatorioSimples();

        // Com cabeçalho e rodapé
        Relatorio cabRodape = new ComRodape(new ComCabecalho(simples));

        // Com tudo (cabeçalho, rodapé e assinatura)
        Relatorio completo = new ComAssinatura(new ComRodape(new ComCabecalho(simples)));

        System.out.println("--- Relatório simples ---");
        App.imprimirRelatorio(simples);

        System.out.println("\n--- Relatório com cabeçalho e rodapé ---");
        App.imprimirRelatorio(cabRodape);

        System.out.println("\n--- Relatório completo ---");
        App.imprimirRelatorio(completo);
    }
}
