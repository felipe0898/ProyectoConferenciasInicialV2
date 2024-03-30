package com.example.servicio;

import com.example.domain.Usuario;
import java.util.List;

public interface UsuarioServicio {
    
    public List<Usuario> listaUsuarios();
    
    public void guardar(Usuario usuario);
    
    public void borrar(Usuario usuario);
    
    public Usuario buscarUsuario(Usuario usuario);
}
