package com.ribeiro.WorkManager.service;


import com.ribeiro.WorkManager.entity.Tarefa;
import com.ribeiro.WorkManager.dto.EditarTarefaDto;
import com.ribeiro.WorkManager.dto.TarefaResponse;
import com.ribeiro.WorkManager.repository.TarefaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EditarTarefaService {
    private final TarefaRepository tarefaRepository;

    public TarefaResponse atualizar(Long idUsuario, Long idTarefa,  EditarTarefaDto dto){
        Tarefa tarefa = tarefaRepository.findById(idTarefa)
                .orElseThrow(() -> new RuntimeException("Tarefa Inexistente"));

        if (!tarefa.getUsuario().getId().equals(idUsuario)) {
            throw new RuntimeException("Essa tarefa não pertence ao usuário informado");
        }

        tarefa.setConcluida(dto.concluida());
        tarefa.setTitulo(dto.titulo());
        tarefa.setDescricao(dto.descricao());
        tarefaRepository.save(tarefa);

        return TarefaResponse.message(tarefa);
    }



}
