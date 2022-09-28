package com.login.login_registro.controller;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.login.login_registro.dto.UsuarioRegistroDTO;

import com.login.login_registro.service.UsuarioServicio;


@Controller
@RequestMapping ("/RegistroUsuario")
public class RegistroUsuarioControlador {

    private UsuarioServicio usuarioServicio;

    public RegistroUsuarioControlador(UsuarioServicio usuarioServicio) {
        super();
        this.usuarioServicio = usuarioServicio;
    }

    @ModelAttribute("usuarioS")
    public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO(){

        return new UsuarioRegistroDTO();

    }

    @GetMapping
    public String MostarFormularioDeRegistro(){
        return "RegistroUsuario";
    }


    @PostMapping
    public String registrarCuentaDeUsuario(@ModelAttribute("usuario")UsuarioRegistroDTO registroDTO){
        usuarioServicio.guardar(registroDTO);
        return "redirect:/RegistroUsuario?exito";
    }


    }
