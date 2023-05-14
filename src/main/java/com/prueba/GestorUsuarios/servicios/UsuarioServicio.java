package com.prueba.GestorUsuarios.servicios;


import com.prueba.GestorUsuarios.Utils.UsuarioNotFoundException;
import com.prueba.GestorUsuarios.dominio.modelo.Usuario;
import com.prueba.GestorUsuarios.infraestructura.repositorios.UsuarioRepository;
import com.prueba.GestorUsuarios.adaptadores.rest.dto.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UsuarioServicio implements UsuarioServicioIn {


    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Override
    public Usuario guardar(UsuarioDTO usuariDTO) {
        Usuario usuario = new Usuario(usuariDTO.getNombre(),
                usuariDTO.getApellido(),usuariDTO.getEmail(),

                passwordEncoder.encode(usuariDTO.getPassword()));
        return usuarioRepository.save(usuario);
    }

    @Override
    public UsuarioDTO consultarUsuario(String username) {
        Usuario usuario = usuarioRepository.findByEmail(username);
        UsuarioDTO usuarioDTO= new UsuarioDTO(usuario.getId(), usuario.getNombre(),usuario.getApellido(),usuario.getEmail());
        return usuarioDTO;
    }

    @Override
    public Usuario modificarUsuario(Usuario usuarioact) throws UsuarioNotFoundException {
           Usuario usuario = usuarioRepository.findByIdUsuario(usuarioact.getId());
            if(usuario == null) {
                throw new UsuarioNotFoundException("El usuario no existe");
            }
           usuarioact.setPassword(passwordEncoder.encode(usuarioact.getPassword()));
            return usuarioRepository.save(usuarioact);
    }

    @Override
    public String eliminarUsuario(String email) throws  UsuarioNotFoundException{
        Usuario usuario = usuarioRepository.findByEmail(email);
        if(usuario == null) {
            throw new UsuarioNotFoundException("El usuario no existe");
        }
        usuarioRepository.delete(usuario);
        return "usuario eliminado";

    }

    @Override
    public List<Usuario> listarUsuarios() {
       return usuarioRepository.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByEmail(username);
        if(usuario == null) {
            throw new UsernameNotFoundException("Usuario o password inválidos");
        }
        return new User(usuario.getEmail(),usuario.getPassword(),new ArrayList<>());

    }
}
