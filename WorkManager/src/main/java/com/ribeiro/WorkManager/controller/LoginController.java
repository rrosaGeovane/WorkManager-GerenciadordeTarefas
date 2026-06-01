package com.ribeiro.WorkManager.controller;

import com.ribeiro.WorkManager.dto.UsuarioLoginDto;
import com.ribeiro.WorkManager.dto.UsuarioResponse;
import com.ribeiro.WorkManager.service.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@AllArgsConstructor
public class LoginController {

    LoginService loginService;

    @PostMapping
    public UsuarioResponse login(@RequestBody UsuarioLoginDto dto){
        return loginService.login(dto);
    }




}
