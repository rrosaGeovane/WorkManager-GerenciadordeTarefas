package com.ribeiro.WorkManager.controller;

import com.ribeiro.WorkManager.dto.UsuarioCadastroDto;
import com.ribeiro.WorkManager.dto.UsuarioResponse;
import com.ribeiro.WorkManager.service.CadastroService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cadastro")
@AllArgsConstructor
public class CadastroController {

    CadastroService cadastroService;

    @PostMapping
    public UsuarioResponse cadastro(@RequestBody UsuarioCadastroDto dto ){
        return cadastroService.cadastrar(dto);
    }


}
