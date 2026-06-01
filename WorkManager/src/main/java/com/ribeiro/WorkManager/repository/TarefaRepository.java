package com.ribeiro.WorkManager.repository;

import com.ribeiro.WorkManager.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    public List<Tarefa> findByUsuarioId(Long idUsuario);
}
