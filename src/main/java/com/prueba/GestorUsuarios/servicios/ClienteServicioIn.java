package com.prueba.GestorUsuarios.servicios;

import com.prueba.GestorUsuarios.adaptadores.rest.dto.ClienteDTO;

public interface ClienteServicioIn  {
 ClienteDTO consultarCliente(int id);
}
