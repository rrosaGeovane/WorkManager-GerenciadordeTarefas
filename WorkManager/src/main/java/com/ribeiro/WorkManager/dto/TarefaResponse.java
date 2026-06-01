package com.ribeiro.WorkManager.dto;

import com.ribeiro.WorkManager.entity.Tarefa;

public record TarefaResponse(String titulo, String descricao) {
    public static TarefaResponse message(Tarefa tarefa){
        return new TarefaResponse(tarefa.getTitulo(), tarefa.getDescricao());
    }
}
