package com.Uniajc.Servicios;

import com.Uniajc.Dao.DocenteDao;
import com.Uniajc.Modelo.Docente;
import java.util.List;

public class DocenteService {
    
    private DocenteDao docenteDao;
    
    public DocenteService() {
        this.docenteDao = new DocenteDao();
    }

    public void registrarDocente(Docente docente) {
        
        if (docente.getName() == null || docente.getName().isEmpty() ||
        docente.getSpecialty() == null || docente.getSpecialty().isEmpty()) {
            throw new IllegalArgumentException("El campo nombre y especialidad son obligatorios.");
        }

        docenteDao.guardar(docente);
    }

    public List<Docente> obtenerTodosLosDocentes() {
        
        return docenteDao.obtenerTodos();
    }

}
