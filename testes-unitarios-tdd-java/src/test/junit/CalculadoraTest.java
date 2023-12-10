package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import br.com.alura.tdd.modelo.Calculadora;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

  @Test
  void deveriaSomarDoisNumerosPositivos() {

    Calculadora calculadora = new Calculadora();
    int soma = calculadora.somar(3, 7);

    assertEquals(10, soma);
  }
}
