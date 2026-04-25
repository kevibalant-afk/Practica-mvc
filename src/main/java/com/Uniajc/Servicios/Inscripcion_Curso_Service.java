package com.Uniajc.Servicios;


import java.util.List;

import com.Uniajc.Dao.Inscripcion_CursoDao;
import com.Uniajc.Modelo.Inscripcion_Curso;

public class Inscripcion_Curso_Service {
    
    private Inscripcion_CursoDao inscripcionDao;

    public Inscripcion_Curso_Service() {
        this.inscripcionDao = new Inscripcion_CursoDao();
    }

    public void registrarInscripcion(Inscripcion_Curso inscripcion) {
        if (inscripcion.getId_estudiante() <= 0) {
            throw new IllegalArgumentException("El ID del estudiante es obligatorio.");
        }
        if (inscripcion.getId_grupo() <= 0) {
            throw new IllegalArgumentException("El ID del grupo es obligatorio.");
        }
        if (inscripcion.getNota_final() < 0 || inscripcion.getNota_final() > 10) {
            throw new IllegalArgumentException("La nota debe estar entre 0 y 10.");
        }
        inscripcionDao.guardar(inscripcion);
    }

    public List<Inscripcion_Curso> obtenerTodasLasInscripciones() {
        return inscripcionDao.obtenerTodos();
    }

}
