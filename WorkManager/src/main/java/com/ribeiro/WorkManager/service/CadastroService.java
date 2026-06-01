package com.ribeiro.WorkManager.service;

import com.ribeiro.WorkManager.entity.Usuario;
import com.ribeiro.WorkManager.dto.UsuarioCadastroDto;
import com.ribeiro.WorkManager.dto.UsuarioResponse;
import com.ribeiro.WorkManager.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CadastroService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioResponse cadastrar(UsuarioCadastroDto dto){
        Usuario usuario = new Usuario();

        if (usuarioRepository.findByEmail(dto.email()) != null){
            throw new RuntimeException("Email já cadastrado");
        }

        usuario.setNome(dto.nome());
        usuario.setEmail(dto.email());
        usuario.setSenha(dto.senha());

        Usuario save = usuarioRepository.save(usuario);
        return UsuarioResponse.response(save);
    }
}
