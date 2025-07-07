package situacoes.decorator;

import situacoes.decorator.Interfaces.Relatorio;

public class App {
    public static void imprimirRelatorio(Relatorio relatorio) {
        System.out.println(relatorio.gerar());
    }
}
