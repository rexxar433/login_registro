package com.login.login_registro.repositorio;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.login.login_registro.enity.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository <Usuario, Long>{
    public Usuario findByEmail(String email);

    @Query(value = "FROM Usuario s WHERE s.Primernombre LIKE :name OR s.Segundonombre LIKE :name")
    public List<Usuario> findByNameContaining(@Param("name") String name);

}
