package br.com.lucashsouza.builder;

import br.com.lucashsouza.entidades.Filme;
import br.com.lucashsouza.entidades.Locacao;
import br.com.lucashsouza.entidades.Usuario;

import java.util.Arrays;
import java.util.Date;

import static br.com.lucashsouza.builder.FilmeBuilder.umFilme;
import static br.com.lucashsouza.builder.UsuarioBuilder.umUsuario;
import static br.com.lucashsouza.utils.DataUtils.obterDataComDiferencaDias;

public class LocacaoBuilder {
    private Locacao locacao;
    private LocacaoBuilder(){}

    public static LocacaoBuilder umaLocacao() {
        LocacaoBuilder builder = new LocacaoBuilder();
        inicializarDadosPadroes(builder);
        return builder;
    }

    public LocacaoBuilder comUsuario(Usuario param) {
        locacao.setUsuario(param);
        return this;
    }

    public static void inicializarDadosPadroes(LocacaoBuilder builder) {
        builder.locacao = new Locacao();
        Locacao elemento = builder.locacao;

        elemento.setUsuario(umUsuario().agora());
        elemento.setFilmes(Arrays.asList(umFilme().agora()));
        elemento.setDataLocacao(new Date());
        elemento.setDataRetorno(obterDataComDiferencaDias(1));
        elemento.setValor(4.0);
    }

    public LocacaoBuilder comListaFilmes(Filme... params) {
        locacao.setFilmes(Arrays.asList(params));
        return this;
    }

    public LocacaoBuilder comDataLocacao(Date param) {
        locacao.setDataLocacao(param);
        return this;
    }

    public LocacaoBuilder comDataRetorno(Date param) {
        locacao.setDataRetorno(param);
        return this;
    }

    public LocacaoBuilder atrasada() {
        locacao.setDataLocacao(obterDataComDiferencaDias(-4));
        locacao.setDataRetorno(obterDataComDiferencaDias(-2));
        return this;
    }

    public LocacaoBuilder comValor(Double param) {
        locacao.setValor(param);
        return this;
    }

    public Locacao agora() {
        return locacao;
    }

}

