package com.login.login_registro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.login.login_registro.service.UsuarioServicioImpl;

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


    @Autowired
    private UsuarioServicioImpl usuarioServicioImpl;

    @GetMapping("/PaginaAdmin")
    public String home(Model model) {
        model.addAttribute("usuario", usuarioServicioImpl.getAllUsuarios());
        return "PaginaAdmin";
    }



    @GetMapping("/PaginaAdmin/new")
    public String listStudents(Model model) {
        model.addAttribute("usuario", usuarioServicioImpl.getAllUsuarios());
        return "PaginaAdmin";
    }


    
}

