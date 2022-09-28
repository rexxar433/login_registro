package com.login.login_registro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.login.login_registro.enity.Usuario;
import com.login.login_registro.service.ListadoService;

import com.login.login_registro.util.PageRender;

@Controller

public class ListadoControlador {

    @Autowired
    private ListadoService listadoService;

    @GetMapping ("PaginaAdmin")
    public String listarUsuarios(@RequestParam(name = "page",defaultValue = "0")int page,Model modelo){
        PageRequest pageRequest = PageRequest.of(page,4);
        Page<Usuario> usuarios = listadoService.findAll(pageRequest);
        PageRender<Usuario> pageRender = new PageRender<>("PaginaAdmin", usuarios);
		
		modelo.addAttribute("titulo","Listado de usuarios");
		modelo.addAttribute("usuarios",usuarios);
		modelo.addAttribute("page", pageRender);
		
		return "PaginaAdmin";
	}
    
}
