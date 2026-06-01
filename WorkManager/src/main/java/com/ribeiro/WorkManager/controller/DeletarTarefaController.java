package com.ribeiro.WorkManager.controller;

import com.ribeiro.WorkManager.service.DeletarTarefaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@AllArgsConstructor
public class DeletarTarefaController {

    private final DeletarTarefaService deletarTarefaService;

    @DeleteMapping("/{idUsuario}/tarefas/{idTarefa}")
    public void deletar(@PathVariable Long idUsuario,
                        @PathVariable Long idTarefa){
        deletarTarefaService.deletar(idUsuario, idTarefa);
    }
}
