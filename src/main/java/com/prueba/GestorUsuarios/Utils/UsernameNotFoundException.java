package com.prueba.GestorUsuarios.Utils;

public class UsernameNotFoundException extends RuntimeException{
    public UsernameNotFoundException(String mensaje) {
        super(mensaje);
    }
}
