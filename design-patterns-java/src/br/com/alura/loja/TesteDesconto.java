package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {

    public static void main(String[] args) {
        Orcamento primeiroOrcamento = new Orcamento();
        primeiroOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        Orcamento segundoOrcamento = new Orcamento();
        segundoOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));

        CalculadoraDeDescontos calculadoraDeDescontos= new CalculadoraDeDescontos();
        System.out.println(calculadoraDeDescontos.calcular(primeiroOrcamento));
        System.out.println(calculadoraDeDescontos.calcular(segundoOrcamento));

    }
}
