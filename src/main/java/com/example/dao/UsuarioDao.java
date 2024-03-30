package com.example.dao;

import com.example.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<Usuario, Long>{
    
}
