package model;

public class Funcionario implements Empregado {
   private String nome;

   public Funcionario(String funcionario1) {
      this.nome = funcionario1;
   }

   public void exibir() {
      System.out.println("Funcionario: " + this.nome);
   }
}
