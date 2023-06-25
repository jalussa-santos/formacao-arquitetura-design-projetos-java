package br.com.alura.loja;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import java.math.BigDecimal;

public class TesteItemOrcamento {

  public static void main(String[] args) {
    Orcamento novo = new Orcamento();
    novo.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
  }
}
