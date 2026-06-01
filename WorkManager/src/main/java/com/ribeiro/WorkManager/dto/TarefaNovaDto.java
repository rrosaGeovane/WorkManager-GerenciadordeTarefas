package com.ribeiro.WorkManager.dto;

import java.time.LocalDateTime;

public record TarefaNovaDto(String titulo,
                            String descricao,
                            LocalDateTime dataCriacao) {
}
