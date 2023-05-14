package com.prueba.GestorUsuarios.servicios;

import com.prueba.GestorUsuarios.dominio.modelo.Usuario;
import com.prueba.GestorUsuarios.adaptadores.rest.dto.UsuarioDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UsuarioServicioIn extends UserDetailsService {
      Usuario guardar(UsuarioDTO usuariDTO);
      UsuarioDTO consultarUsuario(String username);
      Usuario modificarUsuario(Usuario usuario);
      String eliminarUsuario(String email);
      List<Usuario> listarUsuarios();


}
