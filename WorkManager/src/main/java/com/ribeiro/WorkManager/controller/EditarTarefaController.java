package com.ribeiro.WorkManager.controller;

import com.ribeiro.WorkManager.dto.EditarTarefaDto;
import com.ribeiro.WorkManager.dto.TarefaResponse;
import com.ribeiro.WorkManager.service.EditarTarefaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@AllArgsConstructor
public class EditarTarefaController {
    private final EditarTarefaService editarTarefaService;

    @PutMapping ("{idUsuario}/tarefas/{idTarefa}")
    public TarefaResponse editarTarefa (@RequestBody EditarTarefaDto dto,
                                             @PathVariable Long idUsuario,
                                             @PathVariable Long idTarefa){
        return editarTarefaService.atualizar(idUsuario, idTarefa, dto);
    }
}
