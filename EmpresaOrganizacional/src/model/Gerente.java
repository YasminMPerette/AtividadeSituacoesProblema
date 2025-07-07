package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Gerente implements Empregado {
   private String nome;
   private List<Empregado> subordinados = new ArrayList();

   public Gerente(String funcionario1) {
      this.nome = funcionario1;
   }

   public void adicionar(Empregado funcionario1) {
      this.subordinados.add(funcionario1);
   }

   public void exibir() {
      System.out.println("Gerente: " + this.nome);
      Iterator funcionario1 = this.subordinados.iterator();

      while(funcionario1.hasNext()) {
         Empregado funcionario2 = (Empregado)funcionario1.next();
         System.out.print("  -> ");
         funcionario2.exibir();
      }

   }
}