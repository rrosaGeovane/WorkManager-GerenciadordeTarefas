package com.ribeiro.WorkManager.dto;

import com.ribeiro.WorkManager.entity.Tarefa;

import java.time.LocalDateTime;

public record ListagemTarefaResponse(Long idTarefa,
                                     String titulo,
                                     String descricao,
                                     boolean concluida,
                                     LocalDateTime dataCriacao) {

    public static ListagemTarefaResponse message(Tarefa tarefa){
        return new ListagemTarefaResponse(tarefa.getId(),
                tarefa.getTitulo(),
                tarefa.getDescricao(),
                tarefa.getConcluida(),
                tarefa.getDataCriacao());
    }
}
