package br.com.alura.rh;

import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TellDontTask {

    private Funcionario funcionario = new Funcionario("Teste", "0233", Cargo.ANALISTA, new BigDecimal(10));

    BigDecimal aumento = new BigDecimal(100);

    private BigDecimal salario = funcionario.getSalario();

    {
        BigDecimal percentualReajuste = aumento.divide(funcionario.getSalario(), RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) < 0) {
            this.salario =  this.salario.add(aumento);
        }
        else  throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
    }

}
