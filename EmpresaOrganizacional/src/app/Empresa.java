package app;

import model.Funcionario;
import model.Gerente;

public class Empresa {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Ana");
        Funcionario funcionario2 = new Funcionario("Carlos");

        Gerente gerente1 = new Gerente("Marcos");
        gerente1.adicionar(funcionario1);
        gerente1.adicionar(funcionario2);

        Funcionario funcionario3 = new Funcionario("Beatriz");

        Gerente gerente2 = new Gerente("Juliana");
        gerente2.adicionar(gerente2);
        gerente2.adicionar(funcionario3);

        gerente2.exibir();
    }
}
