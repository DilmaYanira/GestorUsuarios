package com.prueba.GestorUsuarios.servicios;

import com.prueba.GestorUsuarios.rest.dto.ClienteDTO;
import org.springframework.security.core.userdetails.UserDetails;

public interface ClienteServicioIn  {
 ClienteDTO consultarCliente(int id);
}
