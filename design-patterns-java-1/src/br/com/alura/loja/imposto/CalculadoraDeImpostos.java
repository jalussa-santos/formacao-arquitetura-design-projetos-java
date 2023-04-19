package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
		switch (tipoImposto) {
			case ICMS:
				return orcamento.getValor().multiply(new BigDecimal("0.1"));
			case ISS:
				return orcamento.getValor().multiply(new BigDecimal("0.6"));
			default:
				return BigDecimal.ZERO;
		}
	}

}
