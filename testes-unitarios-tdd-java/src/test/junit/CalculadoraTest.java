package junit;

import br.com.alura.tdd.modelo.Calculadora;

public class CalculadoraTest {

  Calculadora calculadora = new Calculadora();

  int soma = calculadora.somar(3, 7);
  System.out.println(soma);
}
