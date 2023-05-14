package com.prueba.GestorUsuarios.infraestructura;

import com.prueba.GestorUsuarios.adaptadores.rest.dto.ClienteDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name="clientes", url="https://my.api.mockaroo.com")
public interface ClienteExterno {
    @RequestMapping(method = RequestMethod.GET, value = "/clientes.json?key=95d3d4e0")
    List<ClienteDTO> getClientes();
}
