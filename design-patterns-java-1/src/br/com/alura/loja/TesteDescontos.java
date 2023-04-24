package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;

import java.math.BigDecimal;

public class TesteDescontos {

    public static void main(String[] args) {
        Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("200"),1);
        Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"),1);

        CalculadoraDeDescontos calculadoraDeDescontos= new CalculadoraDeDescontos();
        System.out.println(calculadoraDeDescontos.calcular(primeiroOrcamento));
        System.out.println(calculadoraDeDescontos.calcular(segundoOrcamento));

    }
}
