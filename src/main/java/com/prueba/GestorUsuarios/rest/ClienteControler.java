package com.prueba.GestorUsuarios.rest;

import com.prueba.GestorUsuarios.rest.dto.ClienteDTO;
import com.prueba.GestorUsuarios.servicios.ClienteServicioIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteControler {

    @Autowired
    private ClienteServicioIn clienteServicioIn;

    @GetMapping("/consultarCliente")
    public ClienteDTO consultarCliente(@RequestParam Integer id) {
        return clienteServicioIn.consultarCliente(id);
    }
}
