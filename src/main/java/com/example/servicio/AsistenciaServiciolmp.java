
package com.example.servicio;

import com.example.dao.AsistenciaDao;
import com.example.domain.Asistencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AsistenciaServiciolmp implements AsistenciaServicio{
    
    @Autowired
    private AsistenciaDao asistenciaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Asistencia> listaAsistencias() {
            return (List<Asistencia>) asistenciaDao.findAll();   
    }
}
