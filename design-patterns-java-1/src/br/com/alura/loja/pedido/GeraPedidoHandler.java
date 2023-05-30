package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import java.time.LocalDateTime;

public class GeraPedidoHandler {

  // construtor com injecao de dependencia: repoitory, service

  public void executa(GeraPedido dados) {
    Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
    LocalDateTime data = LocalDateTime.now();

    Pedido pedido = new Pedido(dados.getCliente(), data, orcamento);

    System.out.println("Método de Salvar pedido no banco de dados");
    System.out.println("Método de Enviar e-mail com dado do novo pedido");
  }

}
