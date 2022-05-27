package br.com.lucashsouza.suites;

import br.com.lucashsouza.servicos.CalculadoraTest;
import br.com.lucashsouza.servicos.CalculoValorLocacaoTest;
import br.com.lucashsouza.servicos.LocacaoServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
@SuiteClasses({
        CalculadoraTest.class,
        CalculoValorLocacaoTest.class,
        LocacaoServiceTest.class
})
public class SuiteExecucao {
    // Remover se puder
}
