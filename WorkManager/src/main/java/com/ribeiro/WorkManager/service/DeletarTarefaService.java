package com.ribeiro.WorkManager.service;

import com.ribeiro.WorkManager.entity.Tarefa;
import com.ribeiro.WorkManager.repository.TarefaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeletarTarefaService {

    private final TarefaRepository tarefaRepository;

    public void deletar(Long idUsuario, Long idTarefa){

        Tarefa tarefa = tarefaRepository.findById(idTarefa)
                .orElseThrow(()->new RuntimeException("Tarefa Inexistente!"));

        if (!tarefa.getUsuario().getId().equals(idUsuario)){
            throw new RuntimeException("Essa tarefa não pertence ao Usuário informado");
        }

        tarefaRepository.delete(tarefa);
    }
}
