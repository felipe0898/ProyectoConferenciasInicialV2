package com.example.servicio;

import com.example.dao.SesionDao;
import com.example.domain.Sesion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SesionServicioImp implements SesionServicio {
    
    @Autowired
    private SesionDao sesionDao;

    @Override
    @Transactional(readOnly = true)
    public List<Sesion> listaSesiones() {
            return (List<Sesion>) sesionDao.findAll();   
    }
    
}
