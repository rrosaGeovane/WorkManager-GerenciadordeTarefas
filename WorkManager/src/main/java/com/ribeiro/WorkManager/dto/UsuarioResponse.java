package com.ribeiro.WorkManager.dto;

import com.ribeiro.WorkManager.entity.Usuario;

//Cria-se o record para receber os valores que serão enviados para o frontend
public record UsuarioResponse(String nome, Long id) {
    //cria um método que pega usuário e retorna ele, com o static
    public static UsuarioResponse response(Usuario usuario) {
        return new UsuarioResponse(usuario.getNome(), usuario.getId());
    }
}
