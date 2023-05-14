package com.prueba.GestorUsuarios.adaptadores;

import com.prueba.GestorUsuarios.servicios.UsuarioServicio;
import com.prueba.GestorUsuarios.servicios.UsuarioServicioIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.websocket.server.PathParam;

@Controller
public class LoginControl {

    @Autowired
    private UsuarioServicioIn usuarioServicio;
    @GetMapping("/login")
    public String iniciarSesion() {
        return "login";
    }

    @GetMapping("/inicio")
    public String verPaginaDeInicio(Authentication authentication, Model modelo ) {
        String username = authentication.getName();
        modelo.addAttribute("usuario", usuarioServicio.consultarUsuario(username));
        return "index";

    }
}
