package com.prueba.GestorUsuarios.servicios;


import com.prueba.GestorUsuarios.dominio.modelo.Usuario;
import com.prueba.GestorUsuarios.infraestructura.repositorios.UsuarioRepository;
import com.prueba.GestorUsuarios.rest.dto.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class UsuarioServicio implements UsuarioServicioIn {


    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Override
    public Usuario guardar(UsuarioDTO usuariDTO) {
        Usuario usuario = new Usuario(usuariDTO.getNombre(),
                usuariDTO.getApellido(),usuariDTO.getEmail(),

                passwordEncoder.encode(usuariDTO.getPassword()));
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario consultarUsuario(String username) {
        return usuarioRepository.findByEmail(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByEmail(username);
        if(usuario == null) {
            throw new UsernameNotFoundException("Usuario o password inválidos");
        }
        return new User(usuario.getEmail(),usuario.getPassword(),new ArrayList<>());

    }
}
