package com.Uniajc.Servicios;

import com.Uniajc.Dao.EstudianteDao;
import com.Uniajc.Modelo.Estudiantes;
import java.util.List;

public class EstudianteService {

    private EstudianteDao estudianteDao;
    
    public EstudianteService() {
        this.estudianteDao = new EstudianteDao(); // Inicializamos el DAO para poder usarlo en los métodos del servicio
    }

    public void registrarEstudiante(Estudiantes estudiante) {
        // verificar que el email tenga un formato válido o que los campos no estén vacíos
        
        if (estudiante.getNombre() == null || estudiante.getNombre().isEmpty() ||
        estudiante.getEmail() == null || estudiante.getEmail().isEmpty()) {
            throw new IllegalArgumentException("El campo nombre y correo son obligatorios.");
        }

        // Llamar al método del DAO para guardar el estudiante en la base de datos
        estudianteDao.guardar(estudiante);
    }

    public List<Estudiantes> obtenerTodosLosEstudiantes() {
        // Llamar al método del DAO para obtener la lista de estudiantes desde la base de datos
        return estudianteDao.obtenerTodos();
    }
}



