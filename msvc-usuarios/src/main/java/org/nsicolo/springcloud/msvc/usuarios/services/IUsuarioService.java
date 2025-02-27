package org.nsicolo.springcloud.msvc.usuarios.services;

import org.nsicolo.springcloud.msvc.usuarios.models.entity.Usuario;

import java.util.List;
import java.util.Optional;

//De forma automática ya es un componente de Spring; no tenemos que anotarlo
//Una interfaz es un contrato: indica qué mensajes puede enteder un mensaje pero no nos advierte sobre la implementación de los métodos.
public interface IUsuarioService {
    List<Usuario> findAllUsers();
    Optional<Usuario> findUserById(Long id);
    Usuario save(Usuario usuario);
    void delete(Long id);
}
