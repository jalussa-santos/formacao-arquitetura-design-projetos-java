package br.com.alura.loja;

import br.com.alura.loja.http.HttpClient;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroDeOrcamento;
import java.math.BigDecimal;

public class TesteRegistroOrcamento {

  public static void main(String[] args) {
    Orcamento orcamento = new Orcamento();
    orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
    orcamento.aprovar();
    orcamento.finalizar();

    RegistroDeOrcamento registro = new RegistroDeOrcamento(new HttpClient());
    registro.registrar(orcamento);

  }

}
