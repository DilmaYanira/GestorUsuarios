package com.prueba.GestorUsuarios.infraestructura.repositorios;

import com.prueba.GestorUsuarios.dominio.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    public Usuario findByEmail(String email);
    @Query(value = "select * from usuario where id = ?1",nativeQuery = true)
    public Usuario findByIdUsuario(Long id);

}
