package org.nsicolo.springcloud.msvc.usuarios.services;

import org.nsicolo.springcloud.msvc.usuarios.models.entity.Usuario;
import org.nsicolo.springcloud.msvc.usuarios.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
    //Inyectamos el repository
    @Autowired
    private UsuarioRepository repository;

    @Override
    @Transactional
    public List<Usuario> findAllUsers() {
        //repository.findAll() devuelve un iterable, entonces se debe hacer un casteo para que el metodo devuelva una lista de Usuario
        return (List<Usuario>)repository.findAll();
    }

    @Override
    public Optional<Usuario> findUserById(Long id) {
        return Optional.empty();
    }

    @Override
    public Usuario save(Usuario usuario) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
