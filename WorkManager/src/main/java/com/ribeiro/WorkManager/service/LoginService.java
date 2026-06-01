package com.ribeiro.WorkManager.service;


import com.ribeiro.WorkManager.entity.Usuario;
import com.ribeiro.WorkManager.dto.UsuarioLoginDto;
import com.ribeiro.WorkManager.dto.UsuarioResponse;
import com.ribeiro.WorkManager.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LoginService {
    private final UsuarioRepository usuarioRepository;


    public UsuarioResponse login(UsuarioLoginDto dto) {

        Usuario usuario = usuarioRepository.findByEmail(dto.email());

        if (usuario == null) {
            throw new RuntimeException("Usuário não encontrado");
        }
        if (!usuario.getSenha().equals(dto.senha())){
            throw new RuntimeException("Senha inválida!");
        }
        return new UsuarioResponse(usuario.getNome(), usuario.getId());
    }
}
