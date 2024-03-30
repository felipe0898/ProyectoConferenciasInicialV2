package com.example.web;

import com.example.domain.Sesion;
import com.example.servicio.SesionServicio;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class ControladorRESTsesion {
    
   @Autowired 
   private SesionServicio sesionServicio; 
    
    @GetMapping("/sesion")
    public String sesion(Model model){
        
        List<Sesion> sesiones = sesionServicio.listaSesiones();
        
        log.info("Estoy ejecutando el controlador");
        model.addAttribute("sesiones",sesiones);
        return "verSesion";
        
    }
}
