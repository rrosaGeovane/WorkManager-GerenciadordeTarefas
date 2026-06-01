package com.ribeiro.WorkManager.controller;

import com.ribeiro.WorkManager.dto.ListagemTarefaResponse;
import com.ribeiro.WorkManager.service.ListarTarefaPorIDService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuarios")
@AllArgsConstructor
public class ListarTarefaPorIDController {

    private final ListarTarefaPorIDService listarTarefaPorIDService;

    @GetMapping("/{idUsuario}/tarefas/{idTarefa}")
    public ListagemTarefaResponse listarTarefa(@PathVariable Long idUsuario,
                                               @PathVariable Long idTarefa){
        return listarTarefaPorIDService.selecionar(idUsuario, idTarefa);
    }
}
