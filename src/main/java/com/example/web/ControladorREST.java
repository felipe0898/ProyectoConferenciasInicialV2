package com.example.web;

import com.example.domain.Usuario;
import com.example.servicio.SesionServicio;
import lombok.extern.slf4j.Slf4j;
import com.example.servicio.UsuarioServicio;
import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@Slf4j
public class ControladorREST {
   
   @Autowired 
   private UsuarioServicio usuarioServicio; 
   
    
    @GetMapping("/")
    public String comienzo(Model model){
        
        List<Usuario> usuarios = usuarioServicio.listaUsuarios();
        
        log.info("Estoy ejecutando el controlador");
        model.addAttribute("usuarios",usuarios);
        return "indice";
        
    }
    
    @GetMapping("/agregarUsuario")
    public String agregarUsuario (Usuario usuario){
        return "agregandoUsuario";
    }
    
    @PostMapping("/guardar")
    public String guardar(@Valid Usuario usuario, Errors error){
        if(error.hasErrors()){
            return "agregandoUsuario";
        }
        usuarioServicio.guardar(usuario);
        return "redirect:/";
    }
    
    @GetMapping("/modificar/{id_usuario}")
    public String modificar(Usuario usuario, Model model){
        usuario = usuario = usuarioServicio.buscarUsuario(usuario);
        model.addAttribute(usuario);
        return "agregandoUsuario";
        
    }
    
    @GetMapping("/borrar/{id_usuario}")
    public String borrar(Usuario usuario, Model model){
        usuarioServicio.borrar(usuario);
     
        return "redirect:/";
        
    }
    
    
    
}
