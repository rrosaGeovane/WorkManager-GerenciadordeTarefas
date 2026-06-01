package com.ribeiro.WorkManager.service;

import com.ribeiro.WorkManager.dto.ListagemTarefaResponse;
import com.ribeiro.WorkManager.entity.Tarefa;
import com.ribeiro.WorkManager.repository.TarefaRepository;
import com.ribeiro.WorkManager.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ListarTarefasService {

    private final UsuarioRepository usuarioRepository;
    private final TarefaRepository tarefaRepository;

    public List<ListagemTarefaResponse> listarTarefas(Long idUsuario){
        usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new RuntimeException("Usuário não existe"));

        List<Tarefa> tarefas = tarefaRepository.findByUsuarioId(idUsuario);

        return tarefas.stream().map(ListagemTarefaResponse::message).toList();
    }
}
