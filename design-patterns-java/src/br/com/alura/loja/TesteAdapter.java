package br.com.alura.loja;

import br.com.alura.loja.http.HttpClient;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroDeOrcamento;
import java.math.BigDecimal;

public class TesteAdapter {

  public static void main(String[] args) {
    Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
    orcamento.aprovar();
    ;
    orcamento.finalizar();

    RegistroDeOrcamento registro = new RegistroDeOrcamento(new HttpClient());
    registro.registrar(orcamento);

  }

}
