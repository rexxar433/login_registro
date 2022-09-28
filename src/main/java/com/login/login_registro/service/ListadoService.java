package com.login.login_registro.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.login.login_registro.enity.Usuario;

public interface ListadoService {
    public List<Usuario> findAll();

	public Page<Usuario> findAll(Pageable pageable);

	public Usuario findOne(Long id);

	public void delete(Long id); 
}
