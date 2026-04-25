package com.Uniajc.Controlador;

import com.Uniajc.Modelo.Inscripcion_Curso;
import com.Uniajc.Servicios.Inscripcion_Curso_Service;
import com.Uniajc.Vista.Vista_Inscripcion_Curso;

public class Controlador_Inscripcion_Curso {
    
    private Vista_Inscripcion_Curso vista;
    private Inscripcion_Curso_Service servicio;

    public Controlador_Inscripcion_Curso(Vista_Inscripcion_Curso vista, Inscripcion_Curso_Service servicio) {
        this.vista = vista;
        this.servicio = servicio;
    }

    public void registrarInscripcion() {
        try {
            Inscripcion_Curso ic = vista.solicitarDatosInscripcion();
            if (ic != null) {
                servicio.registrarInscripcion(ic);
                vista.mostrarMensaje("Inscripción registrada exitosamente.");
            }
        } catch (Exception e) {
            vista.mostrarMensaje("Error al registrar la inscripción: " + e.getMessage());
        }
    }

    public void mostrarTodasLasInscripciones() {
        vista.mostrarTodasLasInscripciones(servicio.obtenerTodasLasInscripciones());
    }
}
