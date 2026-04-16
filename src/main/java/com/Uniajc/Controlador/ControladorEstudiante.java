package com.Uniajc.Controlador;


import java.util.List;

import com.Uniajc.Modelo.Estudiantes;
import com.Uniajc.Servicios.EstudianteService;
import com.Uniajc.Vista.VistaEstudiante;

public class ControladorEstudiante {

    private VistaEstudiante vista;
    private EstudianteService servicio;

    public ControladorEstudiante(VistaEstudiante vista, EstudianteService servicio) {
        this.vista = vista;
        this.servicio = servicio;
    }

    public void registrarEstudiante() {
        // Aquí se pueden agregar validaciones o lógica adicional antes de registrar el estudiante
        // Por ejemplo, verificar que el email tenga un formato válido o que los campos no estén vacíos

        try {
            Estudiantes estudiante = vista.solicitarDatosEstudiantes();

            if (estudiante != null) {
                servicio.registrarEstudiante(estudiante);
                vista.mostrarMensaje("Estudiante registrado exitosamente.");
            }

        } catch (Exception e) {
            vista.mostrarMensaje("Error al registrar el estudiante.");
        }

    }

    public void mostrarTodosLosEstudiantes() {
        
        // Llamar al método de la vista para mostrar la lista de estudiantes
        vista.mostrarTodosLosEstudiantes(servicio.obtenerTodosLosEstudiantes());
    }

}
