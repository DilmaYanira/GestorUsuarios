package com.prueba.GestorUsuarios.Utils;

public class UsuarioNotFoundException extends RuntimeException{
    public UsuarioNotFoundException(String mensaje) {
        super(mensaje);
    }
}
