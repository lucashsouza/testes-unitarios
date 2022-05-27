package br.com.lucashsouza.servicos;

import br.com.lucashsouza.entidades.Usuario;

public interface EmailService {

    public void notificarAtraso(Usuario usuario);

}
