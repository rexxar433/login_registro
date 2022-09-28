package com.login.login_registro.controller;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.login.login_registro.dto.UsuarioRegistroDTO;
import com.login.login_registro.enity.Usuario;
import com.login.login_registro.service.UsuarioServicio;
import com.login.login_registro.util.PageRender;

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

    
    public String listarUsuarios(@RequestParam(name = "page",defaultValue = "0")int page,Model modelo){
        PageRequest pageRequest = PageRequest.of(page,5);
        Page<Usuario> usuarios = usuarioServicio.findAll(pageRequest);
        PageRender<Usuario> pageRender = new PageRender<>("/PaginaAdmin", usuarios);
		
		modelo.addAttribute("titulo","Listado de usuarios");
		modelo.addAttribute("usuarios",usuarios);
		modelo.addAttribute("page", pageRender);
		
		return "PaginaAdmin";
	}
    }
