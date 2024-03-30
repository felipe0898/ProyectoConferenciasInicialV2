package com.example.servicio;

import com.example.dao.UsuarioDao;
import com.example.domain.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServicioImp implements UsuarioServicio {

    @Autowired
    private UsuarioDao usuarioDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Usuario> listaUsuarios() {
        
        return (List<Usuario>) usuarioDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Usuario usuario) {
        usuarioDao.save(usuario);
    }

    @Override
    @Transactional
    public void borrar(Usuario usuario) {
        usuarioDao.delete(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario buscarUsuario(Usuario usuario) {
        return usuarioDao.findById(usuario.getId_usuario()).orElse(null);
    }
    
}
