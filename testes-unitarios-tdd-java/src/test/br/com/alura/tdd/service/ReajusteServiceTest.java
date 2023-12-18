package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReajusteServiceTest {

  private ReajusteService service;
  private Funcionario funcionario;

  @BeforeEach
  public void inicializar() {
    System.out.println("Executa no início de cada teste");

    this.service = new ReajusteService();
    this.funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
  }

  @AfterEach
  public void finalizar() {
    System.out.println("Executa no fim de cada teste");
  }

  @BeforeAll
  public static void antesDeTodos() {
    System.out.println("Executa ANTES DE TODOS");
  }

  @AfterAll
  public static void depoisDeTodos() {
    System.out.println("Executa DEPOIS DE TODOS");
  }

  @Test
  void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar() {

    service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

    assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
  }

  @Test
  void reajusteDeveriaSerDeQuinzePorcentoQuandoDesempenhoForBom() {

    service.concederReajuste(funcionario, Desempenho.BOM);

    assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
  }

  @Test
  void reajusteDeveriaSerDeVintePorcentoQuandoDesempenhoForOtimo() {

    service.concederReajuste(funcionario, Desempenho.OTIMO);

    assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
  }
}