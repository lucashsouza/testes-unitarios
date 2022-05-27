package br.com.lucashsouza.servicos;

import br.com.lucashsouza.exceptions.NaoPodeDividirPorZeroException;
import org.junit.*;

public class CalculadoraTest {

    public static StringBuffer ordem = new StringBuffer();

    private Calculadora calculadora;

    @Before
    public void setup() {
        calculadora = new Calculadora();
        System.out.println("iniciando...");
        ordem.append("1");
    }

    @After
    public void tearDown() {
        System.out.println("finalizando...");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println(ordem.toString());
    }

    @Test
    public void deveSomarDoisValores() {
        // cenario
        int valor1 = 2;
        int valor2 = 5;

        // acao
        int resultado = calculadora.somar(valor1, valor2);

        // verificacao
        Assert.assertEquals(7, resultado);
    }

    @Test
    public void deveSubtrairDoisValores() {
        // cenario
        int valor1 = 10;
        int valor2 = 5;

        // acao
        int resultado = calculadora.subtrair(valor1, valor2);

        // verificacao
        Assert.assertEquals(5, resultado);
    }

    @Test
   public void deveDividirDoisValores() throws NaoPodeDividirPorZeroException {
        // cenario
        int valor1 = 6;
        int valor2 = 3;

        // acao
        int resultado = calculadora.dividir(valor1, valor2);

        // verificacao
        Assert.assertEquals(2, resultado);
    }

    @Test(expected = NaoPodeDividirPorZeroException.class)
    public void deveRetornarExceptionDivisionByZero() throws NaoPodeDividirPorZeroException {
        // cenario
        int valor1 = 10;
        int valor2 = 0;

        // acao
        int resultado = calculadora.dividir(valor1, valor2);
    }

    @Test
    public void deveDividir() {
        // cenario
        String valor1 = "6";
        String valor2 = "3";

        // acao
        int resultado = calculadora.dividir(valor1, valor2);

        // verificacao
        Assert.assertEquals(2, resultado);
    }

}
