package com.login.login_registro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistroControlador {
    
    @GetMapping("/PaginaIniciosesion")
    public String iniciarSesion() {
        return "PaginaIniciosesion";
    }

    @GetMapping("/")
    public String VerPaginaDeInicio() {
        return "PaginaPrincipal";
    }


    @GetMapping("/PaginaAdmin")
    public String VerPaginaDeAdmin() {
        return "PaginaAdmin";
    }
}
