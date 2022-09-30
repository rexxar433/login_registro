package com.login.login_registro.service;


import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.login.login_registro.dto.UsuarioRegistroDTO;
import com.login.login_registro.enity.Usuario;

public interface UsuarioServicio extends UserDetailsService {

    public Usuario guardar(UsuarioRegistroDTO registroDTO);

    List<Usuario> getAllUsuarios();
    Usuario getUsuarioById(Long id);
}
