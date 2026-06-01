package com.ribeiro.WorkManager.service;

import com.ribeiro.WorkManager.entity.Tarefa;
import com.ribeiro.WorkManager.entity.Usuario;
import com.ribeiro.WorkManager.dto.TarefaNovaDto;
import com.ribeiro.WorkManager.dto.TarefaResponse;
import com.ribeiro.WorkManager.repository.TarefaRepository;
import com.ribeiro.WorkManager.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class NovaTarefaService {
    private final TarefaRepository tarefaRepository;
    private final UsuarioRepository usuarioRepository;

    public TarefaResponse novaTarefa(Long idUsuario,TarefaNovaDto dto){

        Optional<Usuario> usuario = usuarioRepository.findById(idUsuario);
        Tarefa tarefa = new Tarefa();

        if (usuario.isEmpty()){
            throw new RuntimeException("Usuário não existe");
        }
        else{
            tarefa.setTitulo(dto.titulo());
            tarefa.setDescricao(dto.descricao());
            tarefa.setDataCriacao(dto.dataCriacao());
            tarefa.setConcluida(false);
            tarefa.setUsuario(usuario.get());
        }
        tarefaRepository.save((tarefa));
        return new TarefaResponse(tarefa.getTitulo(), tarefa.getDescricao());
    }
}
