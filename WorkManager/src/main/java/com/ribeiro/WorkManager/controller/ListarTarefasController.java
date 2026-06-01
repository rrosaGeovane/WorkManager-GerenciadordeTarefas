package com.ribeiro.WorkManager.controller;

import com.ribeiro.WorkManager.dto.ListagemTarefaResponse;
import com.ribeiro.WorkManager.service.ListarTarefasService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@AllArgsConstructor
public class ListarTarefasController {

    private final ListarTarefasService listarTarefasService;

    @GetMapping("{idUsuario}/tarefas")
    public List<ListagemTarefaResponse> listar(@PathVariable Long idUsuario){
        return listarTarefasService.listarTarefas(idUsuario);
    }

}
