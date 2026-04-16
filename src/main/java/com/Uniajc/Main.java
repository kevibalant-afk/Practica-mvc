package com.Uniajc;
import java.sql.Connection;

import com.Uniajc.config.ConexionPostgresDatabase;
import com.Uniajc.Controlador.ControladorEstudiante;
import com.Uniajc.Servicios.EstudianteService;
import com.Uniajc.Vista.VistaEstudiante;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practica MVC - Sistema academico Uniajc!");

        VistaEstudiante vista = new VistaEstudiante();
        EstudianteService estudianteService = new EstudianteService();

        // Crear el controlador y pasarle la vista y el servicio
        ControladorEstudiante controlador = new ControladorEstudiante(vista, estudianteService);

        controlador.mostrarTodosLosEstudiantes(); // Llamar al método para mostrar todos los estudiantes antes de registrar uno nuevo

        controlador.registrarEstudiante(); // Llamar al método para registrar un estudiante

        controlador.mostrarTodosLosEstudiantes(); // Llamar al método para mostrar todos los estudiantes después de registrar uno nuevo
       
    }
}); // Llamar al método para mostrar todos los estudiantes antes de registrar uno nuevo

        controlador.registrarEstudiante(); // Llamar al método para registrar un estudiante

        controlador.mostrarTodosLosEstudiantes(); // Llamar al método para mostrar todos los estudiantes después de registrar uno nuevo
       
    }
}
