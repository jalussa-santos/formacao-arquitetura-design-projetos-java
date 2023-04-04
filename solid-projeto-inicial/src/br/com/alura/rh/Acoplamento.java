package br.com.alura.rh;

import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.model.Reajuste;

import java.math.BigDecimal;
import java.util.List;

public class Acoplamento {

    Funcionario funcionario = new Funcionario("nome", "wrwe", Cargo.ANALISTA, new BigDecimal("33"));

    double valorTotalReajustes = 0;
    List<Reajuste> reajustes = funcionario.getReajustes();

    {
        for (Reajuste r : reajustes) {
            valorTotalReajustes += r.getValor();
        }
    }

}
