package com.ribeiro.WorkManager.controller;

import com.ribeiro.WorkManager.dto.TarefaNovaDto;
import com.ribeiro.WorkManager.dto.TarefaResponse;
import com.ribeiro.WorkManager.service.NovaTarefaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@AllArgsConstructor
public class TarefaNovaController {

    private final NovaTarefaService novaTarefaService;

    @PostMapping("/{idUsuario}/tarefas")
    public TarefaResponse novaTarefa(
            @PathVariable Long idUsuario,
            @RequestBody TarefaNovaDto dto){
        return novaTarefaService.novaTarefa(idUsuario, dto);
    }

}
