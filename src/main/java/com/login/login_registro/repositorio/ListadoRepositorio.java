package com.login.login_registro.repositorio;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.login.login_registro.enity.Usuario;

public interface ListadoRepositorio extends PagingAndSortingRepository<Usuario, Long> {
    
}
