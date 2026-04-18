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
        
        
        vista.mostrarTodosLosEstudiantes(servicio.obtenerTodosLosEstudiantes());
    }

}
