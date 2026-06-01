package com.ribeiro.WorkManager.service;

import com.ribeiro.WorkManager.entity.Tarefa;
import com.ribeiro.WorkManager.dto.ListagemTarefaResponse;
import com.ribeiro.WorkManager.repository.TarefaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ListarTarefaPorIDService {

    private final TarefaRepository tarefaRepository;

    public ListagemTarefaResponse selecionar(Long idUsuario,
                                             Long idTarefa){

        Tarefa tarefa = tarefaRepository.findById(idTarefa)
                .orElseThrow(()-> new RuntimeException("Tarefa inexistente!"));

        if(!tarefa.getUsuario().getId().equals(idUsuario)){
            throw new RuntimeException("Essa tarefa não pertence ao usuário informado");
        }

        return ListagemTarefaResponse.message(tarefa);
    }

}
