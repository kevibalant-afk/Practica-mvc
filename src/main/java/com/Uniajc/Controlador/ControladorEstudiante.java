package com.Uniajc.Controlador;


import com.Uniajc.Modelo.Estudiantes;
import com.Uniajc.Servicios.EstudianteService;
import com.Uniajc.Vista.VistaEstudiante;

public class ControladorEstudiante {

    private VistaEstudiante vistaEstudiante;
    private EstudianteService servicio;

    public ControladorEstudiante(VistaEstudiante vistaEstudiante, EstudianteService servicio) {
        this.vistaEstudiante = vistaEstudiante;
        this.servicio = servicio;
    }

    public void registrarEstudiante() {
        // Aquí se pueden agregar validaciones o lógica adicional antes de registrar el estudiante
        // Por ejemplo, verificar que el email tenga un formato válido o que los campos no estén vacíos

        try {
            Estudiantes estudiante = vistaEstudiante.solicitarDatosEstudiantes();

            if (estudiante != null) {
                servicio.registrarEstudiante(estudiante);
                vistaEstudiante.mostrarMensaje("Estudiante registrado exitosamente.");
            }

        } catch (Exception e) {
            vistaEstudiante.mostrarMensaje("Error al registrar el estudiante.");
        }

    }

    public void mostrarTodosLosEstudiantes() {
        
        // Llamar al método de la vista para mostrar la lista de estudiantes
        vistaEstudiante.mostrarTodosLosEstudiantes(servicio.obtenerTodosLosEstudiantes());
    }
    

}
