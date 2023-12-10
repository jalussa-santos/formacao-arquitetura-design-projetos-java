package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class ReajusteServiceTest {

  @Test
  void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar() {

    ReajusteService service = new ReajusteService();
    Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));

    service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

    assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
  }
}
