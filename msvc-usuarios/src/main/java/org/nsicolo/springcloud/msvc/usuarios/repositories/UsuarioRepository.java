package org.nsicolo.springcloud.msvc.usuarios.repositories;

import org.nsicolo.springcloud.msvc.usuarios.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> { //<ClaseEntity, TipoDatoDelId>
}
