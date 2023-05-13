package com.prueba.GestorUsuarios.rest;

import com.prueba.GestorUsuarios.dominio.modelo.Usuario;
import com.prueba.GestorUsuarios.rest.dto.UsuarioDTO;
import com.prueba.GestorUsuarios.servicios.UsuarioServicioIn;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class UsuarioControl {

    @Autowired
    private UsuarioServicioIn usuarioServicioI;
    @PostMapping("/crearUsuario")
    public Usuario crearUsuario(@RequestBody UsuarioDTO usuarioDTO){
     return  usuarioServicioI.guardar(usuarioDTO);
    }

    public Usuario consultarUsuario(@PathVariable String email){
        return null;
    }

}
