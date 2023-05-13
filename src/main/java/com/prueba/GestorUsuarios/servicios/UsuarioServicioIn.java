package com.prueba.GestorUsuarios.servicios;

import com.prueba.GestorUsuarios.dominio.modelo.Usuario;
import com.prueba.GestorUsuarios.rest.dto.UsuarioDTO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsuarioServicioIn extends UserDetailsService {
     Usuario guardar(UsuarioDTO usuariDTO);
     Usuario consultarUsuario(String username);

}
