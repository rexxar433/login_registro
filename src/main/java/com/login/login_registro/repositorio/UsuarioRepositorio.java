package com.login.login_registro.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.login_registro.enity.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository <Usuario, Long>{
    public Usuario findByEmail(String email);


}
