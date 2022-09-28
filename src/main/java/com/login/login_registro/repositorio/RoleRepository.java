package com.login.login_registro.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.login_registro.enity.Rol;


@Repository
public interface RoleRepository extends JpaRepository <Rol, Long>  {
    
}
