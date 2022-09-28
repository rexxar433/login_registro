package com.login.login_registro.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.login.login_registro.dto.UsuarioRegistroDTO;
import com.login.login_registro.enity.Rol;
import com.login.login_registro.enity.Usuario;
import com.login.login_registro.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    private UsuarioRepositorio usuarioRepositorio;

    

    public UsuarioServicioImpl(UsuarioRepositorio usuarioRepositorio) {
        super();
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @Override
	public Usuario guardar(UsuarioRegistroDTO registroDTO) {
		Usuario usuario = new Usuario( registroDTO.getUsuarioS(),registroDTO.getPrimernombre(),registroDTO.getSegundonombre(),
				registroDTO.getPrimerapellido(),registroDTO.getSegundoapellido(),registroDTO.getFechaDeNacimiento(),
				registroDTO.getEdad(),registroDTO.getEmail(),passwordEncoder.encode(registroDTO.getPassword()), Arrays.asList(new Rol("ROLE_USER")));
		return usuarioRepositorio.save(usuario);
	}

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepositorio.findByEmail(username);
        if(usuario == null) {
            throw new UsernameNotFoundException("Usuario o password inválidos");
		}
        return new User(usuario.getEmail(),usuario.getPassword(),mapearAutoridadesRoles(usuario.getRoles()));

    }

    private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles){
       return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> findAll() {
        return (List<Usuario>) usuarioRepositorio.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Usuario> findAll(Pageable pageable) {
        return usuarioRepositorio.findAll(pageable);
    }

    @Override
    @Transactional
    public void save(Usuario usuario) {
       usuarioRepositorio.save(usuario);
        
    }

    @Override
    @Transactional (readOnly = true)
    public Usuario findOne(Long id) {
        return usuarioRepositorio.findById(id).orElse(null);

    }

    @Override
    @Transactional
    public void delete(Long id) {
        usuarioRepositorio.deleteById(id);
        
    }

    


    
    
}
