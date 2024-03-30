
package com.example.web;

import com.example.domain.Asistencia;
import com.example.servicio.AsistenciaServicio;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class ControladorRESTasistencia {
    
   @Autowired 
   private AsistenciaServicio asistenciaServicio; 
    
    @GetMapping("/asistencia")
    public String asistencia(Model model){
        
        List<Asistencia> asistencias = asistenciaServicio.listaAsistencias();
        
        log.info("Estoy ejecutando el controlador");
        model.addAttribute("asistencias",asistencias);
        return "verAsistencia";
        
    }
}
