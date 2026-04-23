package com.Uniajc.Servicios;

import com.Uniajc.Dao.EstudianteDao;
import com.Uniajc.Modelo.Estudiantes;
import java.util.List;

public class EstudianteService {

    private EstudianteDao estudianteDao;
    
    public EstudianteService() {
        this.estudianteDao = new EstudianteDao();
    }

    public void registrarEstudiante(Estudiantes estudiante) {
        
        if (estudiante.getName() == null || estudiante.getName().isEmpty() ||
        estudiante.getEmail() == null || estudiante.getEmail().isEmpty()) {
            throw new IllegalArgumentException("El campo nombre y correo son obligatorios.");
        }

        estudianteDao.guardar(estudiante);
    }

    public List<Estudiantes> obtenerTodosLosEstudiantes() {
        
        return estudianteDao.obtenerTodos();
    }
}