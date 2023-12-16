package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import br.com.alura.tdd.modelo.Funcionario;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BonusServiceTest {

  @Test
  void deveriaRetornarExcecaoParaFuncionarioComSalarioMuitoAlto() {

    assertThrows(IllegalArgumentException.class,
        () -> funcionarioComSalario(new BigDecimal("25000")));
  }

  @Test
  void deveriaRetornarMensagemExcecaoParaFuncionarioComSalarioMuitoAlto() {

    var excecaoEsperada = "Funcionário com salário maior do que R$10000 nao pode receber bonus!";

    try {
      funcionarioComSalario(new BigDecimal("25000"));
    } catch (Exception e) {
      assertEquals(excecaoEsperada, e.getMessage());
    }
  }

  @Test
  void bonusDeveriaSerDezPorCentoDoSalario() {

    BigDecimal valorBonus = funcionarioComSalario(new BigDecimal("2500"));

    Assertions.assertEquals(new BigDecimal("250.00"), valorBonus);
  }

  @Test
  void bonusDeveriaSer10PorCentoParaSalarioDeDezMil() {

    BigDecimal valorBonus = funcionarioComSalario(new BigDecimal("10000"));

    Assertions.assertEquals(new BigDecimal("1000.00"), valorBonus);
  }

  private BigDecimal funcionarioComSalario(BigDecimal salario) {
    BonusService service = new BonusService();
    return service.calcularBonus
        (new Funcionario("Rodrigo", LocalDate.now(), salario));
  }
}