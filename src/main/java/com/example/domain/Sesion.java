package com.example.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="sesion")
public class Sesion implements Serializable {
    
    private static final long serialVersionUID= 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_sesion;
    
    private String nombre_sesion;
    
    private String lugar_sesion;
    
    private String hora_sesion;
    
   
    
}
