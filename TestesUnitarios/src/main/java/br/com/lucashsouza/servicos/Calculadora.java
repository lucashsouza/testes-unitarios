package br.com.lucashsouza.servicos;

import br.com.lucashsouza.exceptions.NaoPodeDividirPorZeroException;

public class Calculadora {

    public int somar(int valor1, int valor2) {
        System.out.println("Estou executando o método somar!");
        return  valor1 + valor2;
    }

    public int subtrair(int valor1, int valor2) {
        return valor1 - valor2;
    }

    public int dividir(int valor1, int valor2) throws NaoPodeDividirPorZeroException {
        if (valor1 == 0 || valor2 == 0) {
            throw new NaoPodeDividirPorZeroException();
        }
        return valor1 / valor2;
    }

    public int dividir(String valor1, String valor2) {
        return Integer.parseInt(valor1) / Integer.parseInt(valor2);
    }

    public void imprime() {
        System.out.println("Passe aqui");
    }
}
