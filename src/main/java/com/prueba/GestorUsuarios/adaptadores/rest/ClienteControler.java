package com.prueba.GestorUsuarios.adaptadores.rest;

import com.prueba.GestorUsuarios.adaptadores.rest.dto.ClienteDTO;
import com.prueba.GestorUsuarios.servicios.ClienteServicioIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cliente")
public class ClienteControler {

    @Autowired
    private ClienteServicioIn clienteServicioIn;

    @GetMapping("/consultarCliente")
    public ClienteDTO consultarCliente(@RequestParam Integer id) {
        return clienteServicioIn.consultarCliente(id);
    }
}
