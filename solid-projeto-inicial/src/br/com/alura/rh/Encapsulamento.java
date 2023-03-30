package br.com.alura.rh;

import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;

public class Encapsulamento {

    private Funcionario funcionario = new Funcionario("Teste","4646", Cargo.ANALISTA,new BigDecimal("56.0"));

    public void alterarSalario(){
        funcionario.setSalario(new BigDecimal("55."));
    }

}
