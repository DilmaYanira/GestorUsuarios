package com.prueba.GestorUsuarios.adaptadores.rest;

import com.prueba.GestorUsuarios.adaptadores.rest.dto.UsuarioDTO;
import com.prueba.GestorUsuarios.dominio.modelo.Usuario;
import com.prueba.GestorUsuarios.servicios.UsuarioServicioIn;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class UsuarioControl {

    @Autowired
    private UsuarioServicioIn usuarioServicioI;
    @PostMapping("/crearUsuario")
    public Usuario crearUsuario(@RequestBody UsuarioDTO usuarioDTO){
     return  usuarioServicioI.guardar(usuarioDTO);
    }

    @PostMapping("/editarUsuario")
    public Usuario modificarUsuiario(@RequestBody Usuario usuario){
          return usuarioServicioI.modificarUsuario(usuario);
    }
    @GetMapping("/eliminarUsuario/{username}")
        public String eliminarUsuario(@PathVariable("username") String email){
        return usuarioServicioI.eliminarUsuario(email);
    }
    @GetMapping("/listarUsuarios")
    public List<Usuario> listarUsuarios(){
        return usuarioServicioI.listarUsuarios();
    }
}
