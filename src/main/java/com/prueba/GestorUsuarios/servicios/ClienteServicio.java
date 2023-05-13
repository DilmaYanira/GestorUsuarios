package com.prueba.GestorUsuarios.servicios;

import com.prueba.GestorUsuarios.infraestructura.ClienteExterno;
import com.prueba.GestorUsuarios.rest.dto.ClienteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicio implements  ClienteServicioIn{
    @Autowired
    private ClienteExterno clienteExterno;
    @Override
    public ClienteDTO consultarCliente(int id){
        List<ClienteDTO> listaClientes = clienteExterno.getClientes();
        ClienteDTO cliente =listaClientes.stream().filter(cli -> cli.getIdCliente().equals(id)).findAny().get();
        return cliente;
    }
}
