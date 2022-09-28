package com.login.login_registro.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.login.login_registro.enity.Usuario;
import com.login.login_registro.repositorio.ListadoRepositorio;


@Service
public class ListatoServiceimpl implements ListadoService{
    private ListadoRepositorio listadoRepositorio;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> findAll() {
        return (List<Usuario>) listadoRepositorio.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Usuario> findAll(Pageable pageable) {
        return listadoRepositorio.findAll(pageable);
    }



    @Override
    @Transactional (readOnly = true)
    public Usuario findOne(Long id) {
        return listadoRepositorio.findById(id).orElse(null);

    }

    @Override
    @Transactional
    public void delete(Long id) {
        listadoRepositorio.deleteById(id);
        
    }
}
