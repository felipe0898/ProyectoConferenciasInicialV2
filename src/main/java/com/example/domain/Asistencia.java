
package com.example.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name="asistencia")
public class Asistencia  implements Serializable{
    
    private static final long serialVersionUID= 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_asistencia;
    
    private Long id_usuario;
    
    private Long id_sesion;
    
  
}
