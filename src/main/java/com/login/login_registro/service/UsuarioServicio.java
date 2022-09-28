package com.login.login_registro.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.login.login_registro.dto.UsuarioRegistroDTO;
import com.login.login_registro.enity.Usuario;

public interface UsuarioServicio extends UserDetailsService {

    public Usuario guardar(UsuarioRegistroDTO registroDTO);

    public List<Usuario> findAll();

	public Page<Usuario> findAll(Pageable pageable);

	public void save(Usuario usuario);

	public Usuario findOne(Long id);

	public void delete(Long id);    
}
